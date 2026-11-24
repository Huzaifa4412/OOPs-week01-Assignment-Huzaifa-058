
public class Car {

    String brand;
    int speed;

    void drive() {
        System.out.println("The " + brand + " is Driving with " + speed);
    }

    // Null Constructor
    Car() {
        this.brand = "toyota";
        this.speed = 10;
    }

    // Parameterized constructor
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

}
