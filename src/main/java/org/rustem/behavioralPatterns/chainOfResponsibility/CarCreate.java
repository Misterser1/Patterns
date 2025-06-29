package org.rustem.behavioralPatterns.chainOfResponsibility;

public abstract class CarCreate {
    private CarStages carStages;
    private CarCreate nextCarCreate;

    public CarCreate(CarStages carStages) {
        this.carStages = carStages;
    }

    public void setNextCarCreate(CarCreate nextCarCreate) {
        this.nextCarCreate = nextCarCreate;
    }

    public void carStageNotify(String messageStage, CarStages stageLevel){
        if (stageLevel.ordinal() >= carStages.ordinal()){
            write(messageStage);
        }
        if (nextCarCreate != null){
            nextCarCreate.carStageNotify(messageStage, stageLevel);
        }
    };

    public abstract void write(String message);
}
