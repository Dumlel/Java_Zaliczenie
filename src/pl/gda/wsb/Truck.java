package pl.gda.wsb;

public class Truck extends Vehicle implements Drive, Refuel {
    private float maxLoad;

    public Truck (String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer, float maxLoad) {
        super(registration, vin, color, price, fuelComsumption, tankLevel, odometer);
        this.maxLoad = maxLoad;
    }

}
