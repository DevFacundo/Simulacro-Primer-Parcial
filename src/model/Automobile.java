package model;

public class Automobile extends Vehicle {
    private Integer airBagQuantity;

    public Automobile(Integer airBagQuantity) {
        this.airBagQuantity = airBagQuantity;
    }

    public Automobile(String modelName, Double price, KindOfVehicle kind, Integer airBagQuantity) {
        super(modelName, price, kind);
        this.airBagQuantity = airBagQuantity;
    }

    public Integer getAirBagQuantity() {
        return airBagQuantity;
    }

    public void setAirBagQuantity(Integer airBagQuantity) {
        this.airBagQuantity = airBagQuantity;
    }


    public Double calculatePrice(Double percentage) {
        return getPrice()+getPrice()*percentage/100;
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "airBagQuantity: " + airBagQuantity;
    }
}
