// package Ch12_Assignments;
//Question 04
class Laptop{
    private String model;
    public double price;
    public void setModel(String model){
        this.model = model;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return "Model : " + model + ", Price : " + price;
    }
}
public class Main {
    public static void main(String[] args) {
        Laptop L1 = new Laptop();
        L1.setModel("Pavilion");   
        L1.setPrice(45972.87);
        System.out.println(L1.toString());
    }

}
