package org.rustem.creationalPatterns.builder;

public class BuildDeviceRunner {
    public static void main(String[] args) {
        Director director = new Director();

        director.setBuilder(new LaptopDeviceBuilder());
        Device device = director.buildDevice();

        System.out.println(device);
    }
}
