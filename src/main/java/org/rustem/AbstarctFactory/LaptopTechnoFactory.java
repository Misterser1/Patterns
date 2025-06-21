package org.rustem.AbstarctFactory;

public class LaptopTechnoFactory implements TechnoFactory {
    @Override
    public Display createDisplay() {
        System.out.println("This Laptop Display");
        return new LaptopDisplay();
    }

    @Override
    public Camera createCamera() {
        System.out.println("This Laptop Camera");
        return new LaptopCamera();
    }

    @Override
    public Charging createCharging() {
        System.out.println("This Laptop Charging");
        return new LaptopCharging();
    }
}
