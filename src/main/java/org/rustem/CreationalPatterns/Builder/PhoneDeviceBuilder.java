package org.rustem.CreationalPatterns.Builder;

public class PhoneDeviceBuilder extends DeviceBuilder{

    @Override
    void buildName() {
        device.setName("Iphone 12");
    }

    @Override
    void buildOs() {
        device.setOs("IOS");
    }

    @Override
    void buildPrice() {
        device.setPrice("70000");
    }
}
