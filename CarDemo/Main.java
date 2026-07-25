/*
 * Huzaifa Mukhtar - B25110006058 - Section B
 * Week 1 OOP Lab - 25 July 2026
 * Main.java creates two cars and shows how their states change independently.
 */
public class Main {
    public static void main(String[] args) {
        // These variables point to two separate Car objects.
        Car bmw = new Car();
        Car tesla = new Car();

        // This empty reference is also shown in the stack and heap diagram.
        Car futureCar = null;

        bmw.setDetails("BMW", "Black", 60.0);
        tesla.setDetails("Tesla", "Red", 35.0);

        System.out.println("TRYING TO MOVE BEFORE STARTING THE ENGINE");
        bmw.moveFast();

        System.out.println("\nBMW DRIVE");
        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.turboMode();
        bmw.horn();

        System.out.println("\nTESLA DRIVE");
        tesla.startEngine();
        tesla.drive();
        tesla.moveRight();
        tesla.moveSlow();

        System.out.println("\nCURRENT STATE OF BOTH OBJECTS");
        System.out.println("BMW state:");
        bmw.displayState();
        System.out.println("Tesla state:");
        tesla.displayState();

        System.out.println("STOPPING THE BMW");
        bmw.stopEngine();
        bmw.displayState();

        System.out.println("futureCar points to: " + futureCar);
    }
}
