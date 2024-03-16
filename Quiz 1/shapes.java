// package Quiz 1;
//question 3
interface Shape{
    void  draw();
}
class Circle implements Shape{
    public void draw(){
        System.out.println("Circle drawn");
    }
}
class Rectangle implements Shape{
    public void draw(){
        System.out.println("Rectangle drawn");
    }
}
public class shapes {
    public static void main(String[] args) {
        Circle c = new Circle();
        Rectangle r = new Rectangle();
        c.draw();
        r.draw();
    }
}
