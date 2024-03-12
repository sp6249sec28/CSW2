import java.math.BigInteger;
class person {
    private String name;
    private String address;
    private BigInteger number;
    public person(String name, String address, BigInteger number) {
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String add){
        address = add;
    }
    public BigInteger getNumber(){
        return number;
    }
    public void setNumber(BigInteger n){
        number = n;
    }
    public String toString(){ //toString() = to give the string representation of the object
        return name + "@" + number;
    }
    public int hashCode(){  //hashCode() = to give the integer representation of an object
        final int prime = 31;
        int result = 1;
        result = prime * result + number.intValue();
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    public boolean equals(person other){  //equals() = to check the equality of the object
        boolean isNameEqual = name.equals(other.name);
        boolean isAddressEqual = address.equals(other.address);
        boolean isNumberEqual = number.equals(other.number);
        if(isNameEqual && isAddressEqual && isNumberEqual){
            return true;
        } else{
            return false;
        }
    }
}
class Student extends person{
    private String name;
    private BigInteger roll;
    public Student(String name, BigInteger roll){
        super(name, null, null);
        this.name = name;
        this.roll = roll;
    }
    public String getName(){
        return name;
    }
    public BigInteger getRoll(){
        return roll;
    }
    public void setName(String n){
        name = n;
    }
    public void setRoll(BigInteger r){
        roll = r;
    }
    public String toString(){
        return name + "@" + roll;
    }
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + roll.intValue();
        result = prime * result + ((name == null) ? 0:name.hashCode());
        return result;
    }
    public boolean equals (Student other){
        boolean isNameEqual = name.equals(other.name);
        boolean isRollEqual = roll.equals(other.roll);
        if(isNameEqual && isRollEqual){
            return true;
        } else{
            return false;
        }
    }
}
public class Person{

    public static void main(String[] args) {
        person p1 = new person("Somnath", "Karanjia", new BigInteger("2987384733"));
        person p2 = new person("Pranab", "Cuttack", new BigInteger("8902192392"));
        Student s1 = new Student("Somnath", new BigInteger("2241018129"));
        Student s2 = new Student("Shivam", new BigInteger("2241016249"));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(p1.equals(p2));
        System.out.println(s1.equals(s2));
    }

}
