package org.rustem.creationalPatterns.builder;

public class LaptopDeviceBuilder extends DeviceBuilder{

    @Override
    void buildName() {
        device.setName("Lenovo G90");
    }

    @Override
    void buildOs() {
        device.setOs("Windows");
    }

    @Override
    void buildPrice() {
        device.setPrice("90000");
    }
}
