package com.example.sharingapp;

/**
 * Created by sarahstone-loveall on 1/11/18.
 */

public abstract class Command {

    private boolean is_executed;

    public Command() {
        is_executed = false;
    }

    public abstract void execute();

    public boolean isExecuted() {
        return is_executed;
    }

    public void setIsExecuted(boolean is_executed) {
        this.is_executed = is_executed;
    }
}
