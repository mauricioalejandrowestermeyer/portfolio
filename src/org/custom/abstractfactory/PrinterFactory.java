package org.custom.abstractfactory;

public class PrinterFactory implements AbstractMachineFactory {

    @Override
    public AbstractMachine createMachine() {
        return new Printer();
    }

    @Override
    public boolean createMainEngine() {
        return true;
    }

    @Override
    public boolean createPowerSupply() {
        return true;
    }
}