// package Assignment_3;

import java.util.ArrayList;
import java.util.Collections;
class Car implements Comparable<Car>{
    private int ModelNo;
    private String Name;
    private int stock;
    public Car(int model,String nm,int stk) {  
        this.ModelNo = model; 
        this.Name=nm; 
        this.stock=stk;  
    } 
    @Override
    public String toString(){
        return "Name " + Name +", Model No " + ModelNo + ", Stock " + stock;
    }  
    public int compareTo(Car car){
        return Integer.compare(this.stock, car.stock);
    }
    
}

public class CarApp {
    public static void main(String[] args) {
        ArrayList<Car> carlist = new ArrayList<>();
        carlist.add(new Car(30487, "Endeavour", 0));
        carlist.add(new Car(35473, "Tractor", 4));
        carlist.add(new Car(39485, "Swift", 8));
        carlist.add(new Car(93845, "WagonR", 4));
        for (Car car : carlist){
            System.out.println(car.toString());
        }
        Collections.sort(carlist);
        System.out.println("\nAfter Sorting :");
        for (Car car : carlist){
            System.out.println(car.toString());
        }
    }
}
