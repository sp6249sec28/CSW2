// package Ch12_Assignments;
//Question 02
public class rectangle {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        System.out.print("Area of the rectangle is: " + rect1.rectArea());
        System.out.println("Perimeter of the rectangle is: " + rect1.rectPerimeter());
        
        //Testing set methods
        rect1.setLength(6);
        System.out.println("\nAfter setting length to 6, Area of the rectangle is: "+ rect1.rectArea());
        System.out.println("Perimeter of the rectangle is: " + rect1.rectPerimeter());
    }
    
}
class Rectangle {
    private int length; 
    private int width;
    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    } 
    public int getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public int getwidth(){
        return width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int rectArea(){
        return length*width;
    }
    public int rectPerimeter(){
        return 2*(length+width);
    }
}
