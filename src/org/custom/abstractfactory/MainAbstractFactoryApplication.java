package org.custom.abstractfactory;

public class MainAbstractFactoryApplication {

    private static AbstractMachineFactory factory;

    private static AbstractMachine machine;

    public static void main(String[] args) {

        String config = args[0];
        if (config.equals("printer")) {
            factory = new PrinterFactory();
        }
        else if (config.equals("car")) {
            factory = new CarFactory();
        }
        else {
            throw new UnsupportedOperationException("No se soporta el tipo indicado.");
        }
        machine = factory.createMachine();

        machine.start();
        machine.doMainJob();
        machine.shutdown();
    }
}
