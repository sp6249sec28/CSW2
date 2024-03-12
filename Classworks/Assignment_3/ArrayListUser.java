// package Assignment_3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class User{
    private String name;
    private int age;
    
    public User(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
public class ArrayListUser{
    public static void main(String[] args){
        ArrayList<User> users = new ArrayList();
        users.add(new User("Alice", 30));
        users.add(new User("Joseph", 25));
        users.add(new User("Pranab", 20));
        
        System.out.println("Users before sorting:");
        for(User user : users){
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());
        }
        Collections.sort(users, (u1, u2) -> u1.getAge() - u2.getAge());
        System.out.println("\n\nUsers after sorting by Name in Ascending order:");
        for(User user: users){
            System.out.println("Name: " + user.getName() + " Age: " + user.getAge());
        }
        
    }
}