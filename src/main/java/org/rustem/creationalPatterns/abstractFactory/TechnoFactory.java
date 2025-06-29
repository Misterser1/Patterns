package org.rustem.creationalPatterns.abstractFactory;

public interface TechnoFactory {
    Display createDisplay();
    Camera createCamera();
    Charging createCharging();
}
