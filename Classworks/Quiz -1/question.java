// package Quiz -1;
import java.util.*;
import java.util.ArrayList;

class Employee<T> {
    private T name;
    private String role;
    private double salary;

    public Employee(T name, double salary) {
        this.name = name;
        this.salary = salary;
        this.role = "intern";
    }
    public Employee(Employee<T> other) {
        this.name = other.name;
        this.salary = other.salary;
        this.role = other.role;
    }
    public void becomePermanent(){
        this.role = "Permanent";
        this.salary *= 2;
    }
    public T getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public String getRole(){
        return role;
    }
    public void setRole(String role){
        this.role = role;
    }
    
    @Override
    public String toString(){
        return "Employee Name : " + name + ", Role : " + role + ", Salary : " + salary ;
    }

    // public void displayDetails() {
    //     System.out.println("Name: " + name);
    //     System.out.println("Role: " + role);
    //     System.out.println("Salary: " + salary);
    // }
}

class company{
    List<Employee<?>> employees;
    public company(){
        this.employees = new ArrayList<Employee<?>>();
    }
    public void addEmployee(Employee<?> employee){
        this.employees.add(employee);
    }
    public void displayEmployee(){
        for(Employee<?> employee : employees){
            System.out.println(employee);
        }
    }
}
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        company c1 = new company();
        c1.addEmployee(new Employee<>("Somnath", 25000));
        c1.addEmployee(new Employee<>("Pranab", 40000));

        System.out.println("Initial list of employee : ");
        c1.displayEmployee();

        Employee<String> firstEmployee = (Employee<String>) c1.employees.get(0);
        firstEmployee.becomePermanent();
        System.out.println("Updated list of employees : ");
        c1.displayEmployee();
    }
}
