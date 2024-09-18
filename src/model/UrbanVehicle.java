package model;

public class UrbanVehicle extends Automobile{
    private Integer MaxCapacity;

    public UrbanVehicle(String modelName, Double price, KindOfVehicle kind, Integer airBagQuantity, Integer maxCapacity) {
        super(modelName, price, kind, airBagQuantity);
        MaxCapacity = maxCapacity;
    }

    public UrbanVehicle(Integer airBagQuantity) {
        super(airBagQuantity);
    }

    public Integer getMaxCapacity() {
        return MaxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        MaxCapacity = maxCapacity;
    }

    @Override
     public Double calculatePrice(Double percentage) {
        return super.calculatePrice(percentage);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Maxime Capacity:" + MaxCapacity;
    }
}
