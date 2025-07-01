package org.rustem.behavioralPatterns.templateMethod;

public class CreateBMW extends CarCreateTemplate{
    @Override
    public void nameCarIsCreate() {
        System.out.println("Name BMW");
    }
}
