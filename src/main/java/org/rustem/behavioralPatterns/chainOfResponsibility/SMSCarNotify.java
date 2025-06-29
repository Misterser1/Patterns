package org.rustem.behavioralPatterns.chainOfResponsibility;

public class SMSCarNotify extends CarCreate{

    public SMSCarNotify(CarStages carStages) {
        super(carStages);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}
