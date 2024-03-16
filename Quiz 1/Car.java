// package Quiz 1;
//question 2
class Vehicle{
    public String color;
    public int stock;
    public Vehicle(String color, int stock){
        this.color = color;
        this.stock = stock;
    }
    public String getColor(){
        return color;
    }
    public int getStock(){
        return stock;
    }
}
public class Car extends Vehicle{
    public String model;
    public Car(String model, String color, int stock){
        super(color,stock);
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void displayDetails(){
        System.out.println("Car Details:");
        System.out.println("Color : " + getColor() +
                          "\nModel : " + getModel() +
                          "\nStock : " + getStock());
    }
    public static void main(String[] args){
        Car c1 = new Car("City","White",34);
        Car c2 = new Car("Verna","Red",37);
        c1.displayDetails();
        c2.displayDetails();
    }
}
