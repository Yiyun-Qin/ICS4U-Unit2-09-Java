/*
* This program is a vehicle class.
*
* @author  Mr Coxall
* @version 1.0
* @since   2020-01-01
*/
public class Main {
  // main program
  public static void main(String[] args) {
    Bike bmx = new Bike("Red", 40, 2);

    System.out.println("Created Bmx bike.\nStatus:\n");
    bmx.status();

    System.out.println("Set the cadense to 10\n");
    bmx.cadense = 10;
    bmx.status();

    System.out.println("\nAccelerate by 15:");
    bmx.accelerate(15);
    bmx.status();

    System.out.println("\nRing bell.");
    bmx.ringBell();

    Truck bigTruck = new Truck("Grey", 200, 4, "HGC-3456F");

    System.out.println("Created a Truck.\nStatus:\n");
    bigTruck.status();

    System.out.println("\nAccelerating, 10 of power for ten seconds:");
    bigTruck.accelerate(10, 10);
    System.out.println("New speed: " + bigTruck.speedCar);

    System.out.println("\nBreaking, 10 of power for 10 sec.");
    bigTruck.accelerate(10, 10);
    System.out.println("New speed: " + bigTruck.speedCar);

    System.out.println("\nApplyed air pressure of 10:");
    bigTruck.applyAir(10);
    System.out.println("New speed: " + bigTruck.speedCar);

    System.out.println("\nDone.");
  }
}
