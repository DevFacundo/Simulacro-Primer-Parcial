package model;

public abstract class Vehicle {
    private String modelName;
    private Double price;
    private KindOfVehicle kind;

    public Vehicle() {
    }

    public Vehicle(String modelName, Double price, KindOfVehicle kind) {
        this.modelName = modelName;
        this.price = price;
        this.kind = kind;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


   public abstract Double calculatePrice(Double percentage);

    @Override
    public String toString() {
        return kind +": "+ modelName+" "+price;

    }
}
