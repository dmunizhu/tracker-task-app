package org.example.strategies;

public class AddTaskStrategy implements TaskStrategies {
    @Override
    public String actionTask(String[] args) {
        System.out.println("hola ejecutando done" + args[1]);
        return "hola ejecutando done" + args[1];
    }
}
