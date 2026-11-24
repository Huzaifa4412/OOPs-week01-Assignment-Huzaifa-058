package week04uniqueclasspractice;

public class Main {
    public static void main(String[] args) {
        Shape myShape = new Circle(5.0);

        myShape.draw();
        System.out.println("Area: " + myShape.calculateArea());
    }
}
