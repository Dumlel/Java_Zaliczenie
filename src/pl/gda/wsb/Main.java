package pl.gda.wsb;

public class Main {

    public static void main(String[] args) {
	    Car car1 = new Car("GDA3145F","WWF12345678GH","red",45050,8,21,8233,3,2);
        Car car2 = new Car("GA4567FD","WWF546245221GH","blue",3400,12,30,70987,5,5);
        Truck truck1 = new Truck("GWE423789","FG237462384","pink",54921,18,54,99009,38907);
        Truck truck2 = new Truck("GWE424789","RN256254672","salmon",875214,20,105,87521,41538);
        Motorcycle motorcycle1 = new Motorcycle("GD4657FH","UH587435347","black",2500,4,9,1050);
        Motorcycle motorcycle2 = new Motorcycle("GD46543JH","UH523326347","green",4268,3,12,1542);

        System.out.println(car1.distAvailable());

    }
}
