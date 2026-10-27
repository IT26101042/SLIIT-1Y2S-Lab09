package Q01;

// a)
abstract class Transport {
    protected String vehicleNumber;
    protected double distanceTravelled;

    public Transport(String vehicleNumber, double distanceTravelled) {
        this.vehicleNumber = vehicleNumber;
        this.distanceTravelled = distanceTravelled;
    }

    // b)
    public abstract double calculateFare();


    public void displayDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Distance Travelled: " + distanceTravelled + " km");
    }
}

// c)
class Bus extends Transport {
    public Bus(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    // d)
    @Override
    public double calculateFare() {
        return 10 * distanceTravelled;
    }


    @Override
    public void displayDetails() {
        System.out.println("---- Bus Details ----");
        super.displayDetails();
        System.out.printf("Fare: Rs. %.2f%n", calculateFare());
    }
}

// c)
class Taxi extends Transport {
    public Taxi(String vehicleNumber, double distanceTravelled) {
        super(vehicleNumber, distanceTravelled);
    }

    // d)
    @Override
    public double calculateFare() {
        return 20 * distanceTravelled + 50;
    }


    @Override
    public void displayDetails() {
        System.out.println("---- Taxi Details ----");
        super.displayDetails();
        System.out.printf("Fare: Rs. %.2f%n", calculateFare());
    }
}

public class Q01 {
    public static void main(String[] args) {
        // e)
        Bus bus = new Bus("NB-1234", 15);
        Taxi taxi = new Taxi("CAB-5678", 10);

        bus.displayDetails();
        System.out.println();
        taxi.displayDetails();
    }
}