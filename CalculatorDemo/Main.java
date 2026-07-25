/*
 * Huzaifa Mukhtar - B25110006058 - Section B
 * Week 1 OOP Lab - 25 July 2026
 * Main.java runs the calculator operations with valid and invalid inputs.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("BASIC OPERATIONS");
        System.out.println("10 + 5 = " + calculator.add(10, 5));
        System.out.println("10 - 5 = " + calculator.subtract(10, 5));
        System.out.println("10 * 5 = " + calculator.multiply(10, 5));
        System.out.println("10 / 5 = " + calculator.divide(10, 5));

        System.out.println("\nMODULUS");
        System.out.println("17 % 5 = " + calculator.modulus(17, 5));
        try {
            calculator.modulus(17, 0);
        } catch (IllegalArgumentException error) {
            System.out.println("17 % 0: " + error.getMessage());
        }

        System.out.println("\nPOWER");
        System.out.println("2^5 = " + calculator.power(2, 5));
        System.out.println("9^0 = " + calculator.power(9, 0));

        System.out.println("\nAVERAGE");
        System.out.println("average(10, 20, 30, 40) = "
                + calculator.average(10, 20, 30, 40));
        try {
            calculator.average();
        } catch (IllegalArgumentException error) {
            System.out.println("average(): " + error.getMessage());
        }

        System.out.println("\nMAXIMUM");
        System.out.println("maximum(4, 18, 7, 12) = "
                + calculator.maximum(4, 18, 7, 12));
        try {
            calculator.maximum();
        } catch (IllegalArgumentException error) {
            System.out.println("maximum(): " + error.getMessage());
        }

        System.out.println("\nDIVISION BY ZERO");
        try {
            calculator.divide(10, 0);
        } catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
}
