package org.custom.abstractfactory;

public class Car implements AbstractMachine {

    private boolean on;

    private boolean running;

    private boolean stopped;

    @Override
    public boolean start() {

        on = true;
        running = false;
        stopped = false;
        return true;
    }

    @Override
    public void doMainJob() {

        stopped = false;
        running = true;
    }

    @Override
    public void sleep() {
        stopped = true;
        running = false;
    }

    @Override
    public void resume() {
        running = true;
        stopped = false;
    }

    @Override
    public boolean shutdown() {
        on = false;
        running = false;
        stopped = true;
        return true;
    }
}
