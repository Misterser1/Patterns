package org.rustem.behavioralPatterns.mediator;

public interface Mediator {
    void sendMessage(String message, Worker worker);
}
