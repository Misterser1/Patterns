package org.rustem.BehavioralPatterns.Command;

public class CarKey {
    private Command carStart;
    private Command carStop;

    public CarKey(Command carStart, Command carStop) {
        this.carStart = carStart;
        this.carStop = carStop;
    }

    public void carStart(){
        carStart.execute();
    }

    public void carStop(){
        carStop.execute();
    }
}
