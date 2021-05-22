package pl.gda.wsb;

public class Truck extends Vehicle {
    private float maxLoad;

    public Truck (String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer) {
        super(registration, vin, color, price, fuelComsumption, tankLevel, odometer);
        this.maxLoad = maxLoad;
    }

}
