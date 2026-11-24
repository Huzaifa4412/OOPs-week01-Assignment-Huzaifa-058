public class ElectricCar extends Vehicle implements Chargeable {
    private int batteryLevel;

    // 1. Default Constructor
    public ElectricCar() {
        super("Generic EV");
        this.batteryLevel = 100;
    }

    // 2. Parameterized Constructor
    public ElectricCar(String brand, int batteryLevel) {
        super(brand);
        this.batteryLevel = batteryLevel;
    }

    // 3. Copy Constructor
    public ElectricCar(ElectricCar other) {
        super(other);
        this.batteryLevel = other.batteryLevel;
    }

    // Getters and Setters
    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }

    @Override
    public void startEngine() {
        System.out.println(getBrand() + " starts silently (Electric).");
    }

    @Override
    public void chargeBattery() {
        this.batteryLevel = 100;
    }

    @Override
    public String toString() {
        return "ElectricCar [Brand=" + getBrand() + ", Battery=" + batteryLevel + "%]";
    }
}