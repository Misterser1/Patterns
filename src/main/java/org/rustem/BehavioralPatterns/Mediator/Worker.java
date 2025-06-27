package org.rustem.BehavioralPatterns.Mediator;

public interface Worker {
    void sendMessage(String message);
    void getMessage(String message);
}
