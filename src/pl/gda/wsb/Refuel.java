package pl.gda.wsb;

public interface Refuel {
    public default void refuel(int liters){
        System.out.println("Refueled"+liters+"liters");
    }
}
