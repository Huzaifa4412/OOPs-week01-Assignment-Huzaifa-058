
public class Main {

    public static void main(String[] args) {
        // ! Car Class

        // // Null constructor
        // Car toyota = new Car();
        // toyota.drive();
        // // Parametrized constructor
        // Car bmw = new Car("BMW", 300);
        // bmw.drive();
        // ! Student Class
        Student huzzi = new Student("Huzaifa", 20, "B25110006058");
        // System.out.println(huzzi.name);
        huzzi.name = "Huzaifa Mukhtar";
        // System.out.println(huzzi.name);
        // System.out.println(huzzi);

        // ? Different objects have independent state:
        Student ayan = new Student("Ayan", 15, "B2500000");

        // System.out.println(ayan);

        // System.out.println(ayan.name);
    }
}
