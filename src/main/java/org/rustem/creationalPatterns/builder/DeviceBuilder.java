package org.rustem.creationalPatterns.builder;

public abstract class DeviceBuilder {
    Device device;

    void createDevice(){
        device = new Device();
    }

    abstract void buildName();
    abstract void buildOs();
    abstract void buildPrice();

    Device getDevice(){
        return device;
    }
}
