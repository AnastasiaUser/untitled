public class Vehicle {

        String name;
        int passengers;
        int fuelCap;
        int mpg;

        public Vehicle(String name, int passengers, int fuelCap) {
        this.passengers = passengers;
        this.fuelCap = fuelCap;
        this.mpg = mpg;
        this.name = name;

    }
        void range() {
            System.out.println("Max distance with full fuelcap is " + fuelCap * mpg + "miles");
        }

    double fuelNeeded(int distance) {
            return (double) distance / mpg;}

        @Override
        public String toString() {
            return "Vehicle{" +
                    "name=" + name +
                    "passengers=" + passengers +
                    ", fuelcap=" + fuelCap +
                    ", mpg=" + mpg +
                    '}';
        }

        }





