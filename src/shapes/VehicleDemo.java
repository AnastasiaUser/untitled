package shapes;

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle mercedes = new Vehicle("mers", 5, 6,7);
        Vehicle jeep = new Vehicle("jeep", 7, 8, 9);

        System.out.println("mers can take " + mercedes.passengers + " passengers to the distance of " + " miles. ");
        mercedes.range();
        System.out.println("jeep can take " + jeep.passengers + " passengers to the distance of " + " miles. ");
        jeep.range();

        int howManyMilesJeepCanGo = jeep.rangeInt();
        System.out.println("this one is from method rangeInt: " + howManyMilesJeepCanGo);


        double gallons = jeep.fuelNeeded(750);
        int rangeNeeded = 1400;
        double gallons2 = mercedes.fuelNeeded(rangeNeeded);

        System.out.println("jeep needs " + gallons + " gallons to go for the distance of 700 miles.");
        System.out.println("mercedes needs " + gallons2 + " gallons to go for the distance of " + rangeNeeded + " miles.");
    }
}




