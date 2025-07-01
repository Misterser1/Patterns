package org.rustem.behavioralPatterns.templateMethod;

public abstract class CarCreateTemplate {
    public void create(){
        System.out.println("Creating car...");
        nameCarIsCreate();
        System.out.println("Sell to a person...");
    }

    public abstract void nameCarIsCreate();
}
