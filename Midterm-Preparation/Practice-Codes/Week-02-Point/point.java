package midpracticeweek02;

class Point{
    private int x;
    private int y;
    // null constructor
    public Point(){
        this.x=0;
        this.y=0;
    }
    //parameterized constructor
    public Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    //copy constructor
    public Point(Point p){
        this.x=p.x;
        this.y=p.y;
    }
    // setter 
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    //getter
    public int getx (){
        return this.x;
    }
    public int gety (){
        return this.y;
    }
// to String()
@Override
public String toString(){
    return "("+this.x+","+this.y+")";
}
public Point add(Point other) {
    return new Point(this.x + other.x,
                     this.y + other.y);
}
public Point subtract(Point other) {
    return new Point(this.x - other.x,
                     this.y - other.y);
}
}