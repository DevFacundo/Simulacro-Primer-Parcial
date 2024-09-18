package model;

import model.interfaces.SportVehicle;

public class Motorcycle extends Vehicle implements SportVehicle {
   private Integer displacement;

    public Motorcycle(Integer displacement) {
        this.displacement = displacement;
    }

    public Motorcycle(String modelName, Double price, KindOfVehicle kind, Integer displacement) {
        super(modelName, price, kind);
        this.displacement = displacement;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return super.toString()+" "+ displacement + "cc";
    }

    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice()+getPrice()*percentage/100;
    }

    @Override
    public String raceOnTrack() {
        return "The motorCycle is on the Track waiting for the Start";
    }
}
