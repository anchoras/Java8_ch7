/*
    this program demonstates inheritance in java
    task 7.1
*/


class Vehicle {
    private int passengers;
    private int fuelcap;
    private int milepergallon;

    int range() {
        return fuelcap * milepergallon;
    }

    double fuelneeded(int milesNeeded) {
        return (double) milesNeeded/milepergallon;
    }

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        milepergallon = m;
    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;
    }

    int getCargo() {
        return cargocap;
    }
    void setCargo(int c) {
        cargocap = c;
    }
}

class TruckDemo {
    public static void main (String args[]) {
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportcar = new Vehicle(2, 14, 12);
        //double gallons;

        int distance = 252;


        System.out.println("For minivan\'s way for " + distance + " miles the voluem of "
                             + minivan.fuelneeded(distance) + " gallons of fuel needed");
        System.out.println("For sportcar\'s way for " + distance + " miles the voluem of "
                             + sportcar.fuelneeded(distance) + " gallons of fuel needed");
        System.out.println();

        Truck semi = new Truck(2, 200, 7, 400);
        Truck pickup = new Truck(3, 28, 15, 2000);
        //gallons = semi.fuelneeded(dist);

        System.out.println("For semi\'s way for " + distance + " miles the voluem of "
                            + semi.fuelneeded(distance) + " gallons of fuel needed");
        System.out.println("Semi can transit " + semi.getCargo() + " pounds");
        System.out.println("For pickup\'s way for " + distance + " miles the voluem of "
                            + pickup.fuelneeded(distance) + " gallons of fuel needed");
        System.out.println("Pickup can transit " + pickup.getCargo() + " pounds");
    }
}