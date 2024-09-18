package model;

import model.interfaces.SportVehicle;

public class RacingCar extends Automobile implements SportVehicle {

    private Integer maxVelocity;



    public RacingCar(String modelName, Double price, KindOfVehicle kind, Integer airBagQuantity, Integer maxVelocity) {
        super(modelName, price, kind, airBagQuantity);
        this.maxVelocity = maxVelocity;
    }

    public RacingCar(Integer airBagQuantity, Integer maxVelocity) {
        super(airBagQuantity);
        this.maxVelocity = maxVelocity;
    }

    public Integer getMaxVelocity() {
        return maxVelocity;
    }

    public void setMaxVelocity(Integer maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public RacingCar(Integer airBagQuantity) {
        super(airBagQuantity);
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                 maxVelocity +"Km";
    }

    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice()+getPrice()*percentage/100;
    }

    @Override
    public String raceOnTrack() {
        return "The car is on the Track in the track, waiting for the Start";
    }
}
