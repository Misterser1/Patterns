package org.rustem.StructuralPatterns.Facade;

public class Engineer {
    private Car car;
    private boolean created;

    public void createCar(Car carCreate) {
        if (carCreate != null){
            created = true;
            car = carCreate;
            System.out.println(carCreate.getName() + " Created");
        }else{
            created = false;
            System.out.println("No car");
        }
    }

    public boolean isCreated() {
        return created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void deleteCar() {
        car = null;
        created = false;
    }
}
