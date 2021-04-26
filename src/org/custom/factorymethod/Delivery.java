package org.custom.factorymethod;

public abstract class Delivery {

    abstract Transport callTransport();

    abstract void deliver();
}
