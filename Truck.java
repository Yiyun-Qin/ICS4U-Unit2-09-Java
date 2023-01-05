/**
 * This is the stack
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-27
 */

 class Truck extends Vehicle {
   private final String licensePlateNumber;
 
   // constructor
 
   public Truck (String color, int speed, int tire, String license) {
     super(color, speed, tire);
     this.licensePlateNumber = license;
   }
 
   // getters
   public void status () {
     super.status();
     System.out.println(" -> License Plate: " + this.licensePlateNumber);
   }
 
   // method
   public void applyAir (int airPressure) {
     this.speedCar = this.speedCar - airPressure / 2;
   }
 }