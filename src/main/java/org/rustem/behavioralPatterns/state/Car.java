package org.rustem.behavioralPatterns.state;

public interface Car {
    void carIsNow();
    Car nextState();
}
