package org.rustem.BehavioralPatterns.Mediator;

public interface Mediator {
    void sendMessage(String message, Worker worker);
}
