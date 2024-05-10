// package Ch12_Assignments;
//Question 01

class car {
    private String make;    
    private String model;    
    public car(String make, String model){
        this.make = make;
        this.model = model;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
}
public class carTester{
    public static void main(String[] args) {
        car mycar1 = new car("Toyota", "Innova");
        car mycar2 = new car(null, null);
        System.out.println("mycar1 - Make: " + mycar1.getMake() + ", Model: "+ mycar1.getModel());
        System.out.println("mycar2 - Make: " + mycar2.getMake() + ", Model: "+ mycar2.getModel());
        mycar2.setMake("Honda");
        mycar2.setModel("City");
        System.out.println("mycar2 - Make: " + mycar2.getMake() + ", Model: "+ mycar2.getModel());
    }
}
