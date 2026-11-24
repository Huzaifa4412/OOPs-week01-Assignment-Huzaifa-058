package week05uniqueclasspractice;

public class Main {
    public static void main(String[] args) {
        // Create an ElectricCar object using the default constructor
        ElectricCar car1 = new ElectricCar();
        System.out.println(car1);
        car1.startEngine();
        car1.chargeBattery();
        System.out.println("Battery after charging: " + car1.getBatteryLevel() + "%");

        // Create an ElectricCar object using the parameterized constructor
        ElectricCar car2 = new ElectricCar("Tesla", 50);
        System.out.println(car2);
        car2.startEngine();
        car2.chargeBattery();
        System.out.println("Battery after charging: " + car2.getBatteryLevel() + "%");

        // Create an ElectricCar object using the copy constructor
        ElectricCar car3 = new ElectricCar(car2);
        System.out.println(car3);
    }
}