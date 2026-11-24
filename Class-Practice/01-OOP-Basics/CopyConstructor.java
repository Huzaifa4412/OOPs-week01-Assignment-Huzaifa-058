
class Student {

    String name;
    String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;

    }

// Copy constructor
    public Student(Student obj) {
        this.name = obj.name;
        this.id = obj.id;
    }

    // toString Method
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "The Name is " + name + " And ID is: " + id;
    }

}

public class CopyConstructor {

    public static void main(String[] args) {
        Student huz = new Student("Huzaifa", "50");
        System.out.println(huz);

        // Calling copy constructor
        Student ayn = new Student(huz);
        System.out.println(ayn);
        ayn.name = "Ayan";
        System.out.println(ayn);
        System.out.println(huz);

    }
}
