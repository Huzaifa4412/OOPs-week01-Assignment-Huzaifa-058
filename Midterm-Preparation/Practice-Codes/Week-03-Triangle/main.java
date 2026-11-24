package midpracticeweek03;

public class main {
    public static void main(String[] args) {
        Point p1=new Point(1,2);
        Point p2=new Point(3,4);
        Point p3=new Point(5,6);
        triangle t1=new triangle(p1,p2,p3);
        System.out.println(t1.toString());
    }
    
}
