
class Student implements Cloneable {

    String name;
    String age;

    public Student(String name, String age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

public class Cloneables {

    public static void main(String[] args) {

        Student huz = new Student("Huzaifa", "10");

        try {

            Student ayn = (Student) huz.clone();
            ayn.age = "20";
            System.out.println(ayn.age);
            System.out.println(huz.age);

        } catch (CloneNotSupportedException e) {

        }
    }

}
