public class VehicleDemo {
        public static void main(String[] args) {

            Vehicle mercedes = new Vehicle();

            mercedes.passengers = 7;
            mercedes.fuelcap = 16;
            mercedes.mpg = 21;

            int range = mercedes.fuelcap * mercedes.mpg;
            System.out.println("mers can take " + mercedes.passengers + " passengers to the distance of " + range + " miles. ");
            mercedes.range();

            double gallons = mercedes.fuelNeeded(700);
            int rangeNeeded = 1400;

            System.out.println("mercedes needs " + gallons + " gallons to go for the distance of ");

        }
    }

