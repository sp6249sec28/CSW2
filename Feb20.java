
    abstract class Vehicle{
        int wheel;
        String type;
        public Vehicle(int wheel, String type){
            this.wheel = wheel;
            this.type = type;
            System.out.println("Vehicle's constructor called");
        }
        public int getwheel(){
            return wheel;
        }
        public abstract void startEngine();
        public abstract void stopEngine();
    }
    class Car extends Vehicle{

        public Car(int wheel, String type) {
            super(wheel, type);
            System.out.println(type + "'s constructor called");        
        }
        public void startEngine(){
            System.out.println(type + "'s engine is started.");
        }
        public void stopEngine(){
            System.out.println(type + "'s engine is stopped.");
        }        
    }
    public class Feb20{
        public static void main(String[] args){
            Vehicle car = new Car(4, "Swift");
            car.startEngine();
            car.stopEngine();
        }
    }

