package shapes;

public class Vehicle {
    String name;
     int passengers;
     int fuelCap;
     int mpg;
    public Vehicle(String name, int passengers, int fuelCap, int mpg) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
        this.name = name;
    }

    void range() {
        System.out.println("Maximum distance with full fuelCap is "
                + fuelCap * mpg + " miles. ");
    }

    int rangeInt(){
        return mpg * fuelCap;
    }

    double fuelNeeded(int distance) {
        return (double) distance / mpg;}


    @Override
    public String toString() {
        return "shapes.Vehicle{" +
                "name=" + name  +
                ", passengers=" + passengers +
                ", fuelCap=" + fuelCap +
                ", mpg=" + mpg +
                '}';
    }
}


