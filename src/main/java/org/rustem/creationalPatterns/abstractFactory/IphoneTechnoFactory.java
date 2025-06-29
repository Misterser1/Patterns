package org.rustem.creationalPatterns.abstractFactory;

public class IphoneTechnoFactory implements TechnoFactory {

    @Override
    public Display createDisplay() {
        System.out.println("This Iphone Display");
        return new IphoneDisplay();
    }

    @Override
    public Camera createCamera() {
        System.out.println("This Iphone Camera");
        return new IphoneCamera();
    }

    @Override
    public Charging createCharging() {
        System.out.println("This Iphone Charging");
        return new IphoneCharging();
    }
}
