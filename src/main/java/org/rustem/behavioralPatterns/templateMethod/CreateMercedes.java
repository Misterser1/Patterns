package org.rustem.behavioralPatterns.templateMethod;

public class CreateMercedes extends CarCreateTemplate {

    @Override
    public void nameCarIsCreate() {
        System.out.println("Name Mercedes");
    }
}
