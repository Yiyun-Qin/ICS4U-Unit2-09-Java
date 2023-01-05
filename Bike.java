/**
 * This is the stack.
 *
 * @author  Yiyun Qin
 * @version 1.0
 * @since   2022-10-27
 */
 class Bike extends Vehicle {
   public int cadense = 0;

   // constructor
   public Bike(String color, int maxSpeed, int tire) {
     super(color, maxSpeed, tire);
   }

   // getters

   // setters

   public void status() {
     this.speedCar = this.cadense * 2;
     super.status();
     System.out.println(" -> Cadense: " + this.cadense);
   }

   public void ringBell() {
     System.out.println("Ding ding!\n");
   }

   // method
   public void accelerate(int appliedPower) {
     this.cadense = this.cadense + appliedPower;
     this.speedCar = this.cadense * 2;
   }
 }
