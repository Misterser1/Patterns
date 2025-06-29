package org.rustem.structuralPatterns.decorator;

public class RedBMW extends CarDecorator{
    public RedBMW(Car car) {
        super(car);
    }

    public String fillRed(){
       return  " filling red color.";
    }

    @Override
    public String createCar() {
      return super.createCar() + fillRed();
    }
}
