package org.rustem.behavioralPatterns.chainOfResponsibility;

public class EmailCarNotify extends CarCreate{

    public EmailCarNotify(CarStages carStages) {
        super(carStages);
    }

    @Override
    public void write(String message) {
        System.out.println("Email: " + message);
    }
}
