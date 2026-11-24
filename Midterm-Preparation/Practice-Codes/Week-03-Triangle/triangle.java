package midpracticeweek03;

public class triangle {
    //attributes
    private Point A;
    private Point B;
    private Point C;
    //null constructor
    public triangle(){
        this.A=new Point();
        this.B=new Point();
        this.C=new Point();
    }
    //parameterized constructor
    public triangle(Point A, Point B, Point C){
        this.A=A;
        this.B=B;
        this.C=C;
    }
    //copy constructor
    public triangle(triangle t){
        this.A=t.A;
        this.B=t.B;
        this.C=t.C;
    }
//setter
    public void setA(Point A){
        this.A=A;
    }
    public void setB(Point B){
        this.B=B;
    }
    public void setC(Point C){
        this.C=C;
    }
    //getter
    public Point getA(){
        return this.A;
    }
    public Point getB(){
        return this.B;
    }
    public Point getC(){
        return this.C;
    }
    // to String()
    @Override
    public String toString(){
        return "Triangle: A"+this.A.toString()+" B"+this.B.toString()+" C"+this.C.toString();
    }
    public double distance(Point other)
    {
        double dx = this.A.getx() - other.getx();
        double dy = this.A.gety() - other.gety();
        return Math.sqrt(dx * dx + dy * dy);
    }

    
}
