package org.rustem.BehavioralPatterns.Mediator;

public class AutoCreateRunner {
    public static void main(String[] args) {
        AutoCreateChat autoCreateChat = new AutoCreateChat();

        Worker headEngineer = new AutomotiveEngineer(autoCreateChat, "Justin");
        Worker designEngineerFirst = new DesignEngineer(autoCreateChat, "Leo");
        Worker designEngineerSecond = new DesignEngineer(autoCreateChat, "Den");
        Worker transportDesigner = new TransportDesigner(autoCreateChat, "Tom");

        autoCreateChat.setHeadEngineer(headEngineer);
        autoCreateChat.addWorkerToChat(designEngineerFirst);
        autoCreateChat.addWorkerToChat(designEngineerSecond);
        autoCreateChat.addWorkerToChat(transportDesigner);

        headEngineer.sendMessage("Hello guys today starting a develop BMW");
        designEngineerFirst.sendMessage("Hi, ok im ready");

    }
}
