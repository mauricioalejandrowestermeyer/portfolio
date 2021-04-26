package org.custom.abstractfactory;

public class CarFactory implements AbstractMachineFactory {


    @Override
    public AbstractMachine createMachine() {
        return new Car();
    }

    @Override
    public boolean createMainEngine() {
        return false;
    }

    @Override
    public boolean createPowerSupply() {
        return false;
    }
}
