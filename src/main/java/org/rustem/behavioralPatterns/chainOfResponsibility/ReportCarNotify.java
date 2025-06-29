package org.rustem.behavioralPatterns.chainOfResponsibility;

public class ReportCarNotify extends CarCreate{

    public ReportCarNotify(CarStages carStages) {
        super(carStages);
    }

    @Override
    public void write(String message) {
        System.out.println("Report: " + message);
    }
}
