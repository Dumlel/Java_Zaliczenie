package pl.gda.wsb;

public class Car extends Vehicle {
    private int doors;
    private int seats;


    public Car (String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer) {
        super(registration, vin, color, price, fuelComsumption, tankLevel, odometer);
        this.doors = doors;
        this.seats = seats;
    }



}
