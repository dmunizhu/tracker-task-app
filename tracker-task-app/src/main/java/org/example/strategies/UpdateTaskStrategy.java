package org.example.strategies;

public class UpdateTaskStrategy implements TaskStrategies {
    @Override
    public String actionTask(String[] args) {
        return "hola ejecutando in-progress" + args[1];
    }
}
