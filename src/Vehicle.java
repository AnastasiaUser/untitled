public class Vehicle {

        int passengers;
        int fuelcap;
        int mpg;

        void range() {
            System.out.println("Max distance with full fuelcap is " + fuelcap * mpg + "miles");
        }
        double fuelNeeded(int distance) {
            return (double) distance / mpg;
        }

            }



