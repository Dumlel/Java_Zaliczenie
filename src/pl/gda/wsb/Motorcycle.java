package pl.gda.wsb;

public class Motorcycle extends Vehicle implements Drive, Refuel {

    public Motorcycle (String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer) {
        super(registration, vin, color, price, fuelComsumption, tankLevel, odometer);
    }

}