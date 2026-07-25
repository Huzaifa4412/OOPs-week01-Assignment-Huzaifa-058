/*
 * Student Name: Huzaifa Mukhtar
 * Seat Number: B25110006058
 * Section: B
 * Date: 25 July 2026
 * File: Main.java
 * Purpose: Creates two independent Car objects and tests their behaviour.
 */
public class Main {
    public static void main(String[] args) {
        // bmw and tesla are reference variables stored in the stack.
        // The new keyword instantiates separate Car objects in the heap.
        Car bmw = new Car();
        Car tesla = new Car();

        // A null reference does not point to any object.
        Car futureCar = null;

        bmw.setDetails("BMW", "Black", 60.0);
        tesla.setDetails("Tesla", "Red", 35.0);

        System.out.println("TEST 1 - ENGINE-OFF RULE");
        bmw.moveFast();

        System.out.println("\nTEST 2 - BMW MOVEMENT AND TURBO");
        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.moveLeft();
        bmw.turboMode();
        bmw.horn();

        System.out.println("\nTEST 3 - TESLA MOVEMENT");
        tesla.startEngine();
        tesla.drive();
        tesla.moveRight();
        tesla.moveSlow();

        System.out.println("\nTEST 4 - INDEPENDENT OBJECT STATES");
        System.out.println("BMW state:");
        bmw.displayState();
        System.out.println("Tesla state:");
        tesla.displayState();

        System.out.println("TEST 5 - STOP ENGINE RULE");
        bmw.stopEngine();
        bmw.displayState();

        System.out.println("Null reference check: futureCar = " + futureCar);
    }
}
