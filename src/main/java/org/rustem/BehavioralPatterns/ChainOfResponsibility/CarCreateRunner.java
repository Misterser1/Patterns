package org.rustem.BehavioralPatterns.ChainOfResponsibility;

public class CarCreateRunner {
    public static void main(String[] args) {
        CarCreate reportNotify = new ReportCarNotify(CarStages.DESIGNING);
        CarCreate emailNotify = new EmailCarNotify(CarStages.CONCEPT);
        CarCreate smsNotify = new SMSCarNotify(CarStages.REALIZATION);

        reportNotify.setNextCarCreate(emailNotify);
        emailNotify.setNextCarCreate(smsNotify);

        reportNotify.carStageNotify("Design create...", CarStages.DESIGNING);
        reportNotify.carStageNotify("Concept create...", CarStages.CONCEPT);
        reportNotify.carStageNotify("Car is ready realization...", CarStages.REALIZATION);
    }
}
