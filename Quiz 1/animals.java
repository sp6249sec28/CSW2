// package Quiz 1;
//question 4
class Animal{
    public void sound(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    public void sound(){
        System.out.println("Dog barks.");
    }
}
public class animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.sound();
        dog.sound();
    }
}
