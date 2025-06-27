package org.rustem.BehavioralPatterns.Mediator;

public class TransportDesigner implements Worker{
    private Mediator mediator;
    private String name;

    public TransportDesigner(Mediator mediator,String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(this.name + " receiving message: " + message);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
