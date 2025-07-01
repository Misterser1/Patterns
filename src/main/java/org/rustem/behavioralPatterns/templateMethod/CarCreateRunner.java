package org.rustem.behavioralPatterns.templateMethod;

public class CarCreateRunner {
    public static void main(String[] args) {
        CarCreateTemplate carCreateTemplate = new CreateBMW();

        carCreateTemplate.create();
    }
}
