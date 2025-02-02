package org.example.factory;

import org.example.enumtask.StatusEnum;
import org.example.strategies.AddTaskStrategy;
import org.example.strategies.TaskStrategies;
import org.example.strategies.UpdateTaskStrategy;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TaskFactoryImpl {


    private final Map<StatusEnum, TaskStrategies> status = new EnumMap<>(StatusEnum.class);

    public TaskFactoryImpl(String[] args) {
    }

    public TaskFactoryImpl(AddTaskStrategy addTaskStrategy, UpdateTaskStrategy updateTaskStrategy) {
        status.put(StatusEnum.DONE, addTaskStrategy);
        status.put(StatusEnum.PROGRESS, updateTaskStrategy);
    }

    public TaskStrategies getStrategy(String[] args) {
        return Optional.ofNullable(args)
                .filter(p -> p[0].equals("done"))
                .map(
                        p-> status.get(StatusEnum.DONE))
                .orElse(status.get(StatusEnum.PROGRESS));
    }
}
