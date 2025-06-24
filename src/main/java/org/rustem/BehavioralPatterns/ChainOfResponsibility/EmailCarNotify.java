package org.rustem.BehavioralPatterns.ChainOfResponsibility;

public class EmailCarNotify extends CarCreate{

    public EmailCarNotify(CarStages carStages) {
        super(carStages);
    }

    @Override
    public void write(String message) {
        System.out.println("Email: " + message);
    }
}
