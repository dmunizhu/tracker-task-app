package org.example.enumtask;

public enum StatusEnum {
        DONE("done"),
        PROGRESS("in-progress");

        private String description;

        StatusEnum(String description) {
                this.description = description;
        }

        String getDescription(){
                return description;
        }
}
