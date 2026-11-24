
class Student {

    Student() {
        System.out.println("I am student");
    }

    Student(String name) {
        this(name, "60");
    }

    Student(String name, String id) {
        System.out.println("The Name of Student is: " + name + " and the ID of student is: " + id);
    }
}

class ConstructorChainingAndOverloading {

    public static void main(String[] args) {
        Student std = new Student();
        Student std2 = new Student("Huzaifa", "50");
        Student std3 = new Student("Huzaifa");

    }

}
