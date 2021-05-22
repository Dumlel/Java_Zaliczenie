package pl.gda.wsb;

public abstract class Vehicle {

    public Vehicle(String registration, String vin, String color, float price, float fuelComsumption, float tankLevel, float odometer){
        this.registration = registration;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.fuelComsumption = fuelComsumption;
        this.tankLevel = tankLevel;
        this.odometer = odometer;
}
    protected String registration;
    protected String vin;
    protected String color;
    protected float price;
    protected float fuelComsumption;
    protected float tankLevel;
    protected float odometer;

    public float distAvailable(){
        return (tankLevel*100/fuelComsumption);
    }

}
