
public class Student {

    String name;
    int age;
    String seatno;

    public Student(String name, int age, String seatno) {

        this.name = name;
        this.age = age;
        this.seatno = seatno;

    }

    @Override
    public String toString() {
        return "hello, object name is " + this.name + ",  Age is: " + this.age + " " + " Seat Number: " + this.seatno;
    }

}
