/*
 * Huzaifa Mukhtar - B25110006058 - Section B
 * Week 1 OOP Lab - 25 July 2026
 * Calculator.java contains the operations used in the calculator program.
 */
public class Calculator {
    public Calculator() {
    }

    public double add(double first, double second) {
        return first + second;
    }

    public double subtract(double first, double second) {
        return first - second;
    }

    public double multiply(double first, double second) {
        return first * second;
    }

    public double divide(double first, double second) {
        if (second == 0.0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return first / second;
    }

    public double modulus(double first, double second) {
        if (second == 0.0) {
            throw new IllegalArgumentException("Cannot calculate modulus by zero.");
        }
        return first % second;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // double... lets the method receive any number of values as an array.
    public double average(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Average needs at least one number.");
        }

        double total = 0.0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }

    public double maximum(double... numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Maximum needs at least one number.");
        }

        double largest = numbers[0];
        for (double number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }
        return largest;
    }
}
