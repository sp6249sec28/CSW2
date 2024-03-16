// package Quiz 1;
//question 1
class employee{
    public String name;
    public int id;
    public employee(String name, int id) {
        this.name = name;
        this.id =id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void displayDetails(){
        System.out.println("Name: "+name + ", ID: "+id);
    }
}

public class employeeDetails {
    public static void main(String[] args) {
        employee emp1 = new employee("Shivam", 34);
        employee emp2 = new employee("Somnath",42);
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
