interface Chargeable {
    void chargeBattery();
}

abstract class Vehicle {
    private String brand;

    // Default Constructor
    public Vehicle() { this.brand = "Unknown"; }

    // Parameterized Constructor
    public Vehicle(String brand) { this.brand = brand; }

    // Copy Constructor
    public Vehicle(Vehicle other) { this.brand = other.brand; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    @Override
    public String toString() { return "Vehicle [Brand=" + brand + "]"; }

    public abstract void startEngine();
}