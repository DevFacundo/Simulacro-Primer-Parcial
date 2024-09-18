package model;

public class UtilitaryVehicle extends Vehicle{
    private Double maxSupport;
    private Double height;

    public UtilitaryVehicle(String modelName, Double price, KindOfVehicle kind, Double maxSupport, Double height) {
        super(modelName, price, kind);
        this.maxSupport = maxSupport;
        this.height = height;
    }

    public UtilitaryVehicle(Double maxSupport, Double height) {
        this.maxSupport = maxSupport;
        this.height = height;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    public Double getMaxSupport() {
        return maxSupport;
    }

    public void setMaxSupport(Double maxSupport) {
        this.maxSupport = maxSupport;
    }

    @Override
    public String toString() {
        return super.toString()+" "+
                "Maxime Support: " + maxSupport +
                ", height=" + height;
    }

    @Override
    public Double calculatePrice(Double percentage) {
        return getPrice()+getPrice()*percentage/100;
    }
}
