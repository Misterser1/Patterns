package org.rustem.BehavioralPatterns.Mediator;

import java.util.ArrayList;
import java.util.List;

public class AutoCreateChat implements Mediator{
    private Worker headEngineer;
    private List<Worker> workers = new ArrayList<>();

    public void addWorkerToChat(Worker worker){
        this.workers.add(worker);
    }

    @Override
    public void sendMessage(String message, Worker worker) {
        for (Worker w : workers){
            if (w != worker){
                w.getMessage(message);
            }
        }
        headEngineer.getMessage(message);
    }

    public void setHeadEngineer(Worker headEngineer) {
        this.headEngineer = headEngineer;
    }
}
