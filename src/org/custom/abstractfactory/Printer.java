package org.custom.abstractfactory;

public class Printer implements AbstractMachine {

    private boolean on;

    private boolean waiting;

    private boolean printing;

    @Override
    public boolean start() {
        on = true;
        waiting = true;
        return true;
    }

    @Override
    public void doMainJob() {
        if (on && waiting) {
            printing = true;
        }
    }

    @Override
    public void sleep() {
        waiting = false;
    }

    @Override
    public void resume() {
        waiting = true;
    }

    @Override
    public boolean shutdown() {
        on = false;
        return true;
    }
}
