package org.rustem.behavioralPatterns.observer;

import java.util.List;

public class LamborghiniFan implements Observer{
    private String name;

    public LamborghiniFan(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> cars) {
        System.out.println("Hi " + name + " news for you: " + String.join(", ", cars) + " in sell");
    }
}
