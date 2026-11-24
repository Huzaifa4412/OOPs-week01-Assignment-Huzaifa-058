
class Address {

    String address;

    Address(String address) {
        this.address = address;
    }
}

class Student {

    String name;
    String id;
    Address address;

    public Student(String name, String id, Address address) {
        this.name = name;
        this.id = id;
        this.address = address;
    }

    // Copy Constructor | Shallow Copy
    // public Student(Student obj) {
    //     this.name = obj.name;
    //     this.id = obj.id;
    //     this.address = obj.address;
    // }
    // Copy Constructor | Deep Copy
    public Student(Student obj) {
        this.name = obj.name;
        this.id = obj.id;
        this.address = new Address(obj.address.address);
    }

}

public class ShallowVsDeepCopy {

    public static void main(String[] args) {

        Address add = new Address("karachi");

        Student huz = new Student("Huzaifa", "10", add);
        System.out.println(huz.address.address);
        Student ayc = new Student(huz);
        huz.address.address = "Lahore";
        System.out.println(ayc.address.address);
        System.out.println(huz.address.address); // Shallow Copy Mutable objects reference

    }

}
