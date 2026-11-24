
import javax.annotation.processing.SupportedOptions;

class Address implements Cloneable {

    String address;

    public Address(String address) {
        this.address = address;
    }

    @Override 

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Student implements Cloneable {

    String name;
    Address address;

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override

    public Object clone() throws CloneNotSupportedException {
        Student copy = (Student) super.clone();
        copy.address = (Address) address.clone();
        return copy;
    }

}

public class DeepCloneable {

    public static void main(String[] args) {
        Address address = new Address("Karachi");

        Student huz = new Student("Huzaifa", address);

        try {

            Student ayn = (Student) huz.clone();
            ayn.address.address = "Lahore";
            System.out.println(ayn.address.address);
            System.out.println(huz.address.address);
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

    }

}
