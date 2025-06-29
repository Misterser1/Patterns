package org.rustem.behavioralPatterns.observer;

public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
