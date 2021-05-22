package pl.gda.wsb;

public interface Drive {
    public default void drive (int km){
        System.out.println("Drove for"+km+"km");
    }

}
