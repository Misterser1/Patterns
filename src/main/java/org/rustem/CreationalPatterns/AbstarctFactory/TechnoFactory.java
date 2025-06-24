package org.rustem.CreationalPatterns.AbstarctFactory;

public interface TechnoFactory {
    Display createDisplay();
    Camera createCamera();
    Charging createCharging();
}
