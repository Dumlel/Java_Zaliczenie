package pl.gda.wsb;

public abstract class Vehicle {

    public Vehicle(String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float Odometer){
        this.registration = registration;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.fuelComsumption = fuelComsumption;
        this.tankLevel = tankLevel;
        this.Odometer = Odometer;
}
    private String registration;
    private String vin;
    private String color;
    private float price;
    private float fuelComsumption;
    private float tankLevel;
    private float Odometer;





}
