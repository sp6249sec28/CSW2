package Ch12_Assignments;
//Question 03
class points{
    private double x;
    private double y;
    public points(double x,double y){
        this.x = x;
        this.y = y;
    }
    public double getX(){
        return x;
    }
    public void setX(double x){
        this.x = x;
    }
    public double getY(){
        return y;
    }
    public void setY(double y){
        this.y = y;
    }
}
public class point {
    public static void main(String[] args) {
        points p1 = new points(3.4, 5.1);
        points p2 = new points(3.2, 5.4);
        System.out.println("Point 1 : X="+ p1.getX()+", Y="+ p1.getY());
        p1.setX(2.6);
        p1.setY(7.2);
        System.out.println("After updating the points, Point 1 : X="+ p1.getX()+", Y="+ p1.getY());
    }    
}
