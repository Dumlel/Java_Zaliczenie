package pl.gda.wsb;

public class Car extends Vehicle implements Drive, Refuel {
    private int doors;
    private int seats;


    public Car (String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer, int doors, int seats) {
        super(registration, vin, color, price, fuelComsumption, tankLevel, odometer);
        this.doors = doors;
        this.seats = seats;
    }


}
