package org.example;

import org.example.factory.TaskFactoryImpl;
import org.example.strategies.AddTaskStrategy;
import org.example.strategies.UpdateTaskStrategy;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        TaskFactoryImpl factory = new TaskFactoryImpl(new AddTaskStrategy(), new UpdateTaskStrategy()); // ✅ Usa el constructor correcto

        Optional.ofNullable(args)
                .map(p -> factory.getStrategy(p).actionTask(p));
    }
}
