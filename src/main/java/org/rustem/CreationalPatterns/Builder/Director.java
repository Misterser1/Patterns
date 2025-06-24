package org.rustem.CreationalPatterns.Builder;

public class Director {
    DeviceBuilder builder;

    public void setBuilder(DeviceBuilder builder) {
        this.builder = builder;
    }

    Device buildDevice(){
        builder.createDevice();
        builder.buildName();
        builder.buildOs();
        builder.buildPrice();

        Device device = builder.getDevice();

        return device;
    }
}
