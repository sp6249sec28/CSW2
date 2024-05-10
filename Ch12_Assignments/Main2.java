// package Ch12_Assignments;
//Question 05
class College{
    private String collegeName;
    private String collegeLoc;
    public College(String collegeName, String collegeLoc){
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
    public void collegeInfo(){
        System.out.println("College Name: "+collegeName);
        System.out.println("College Loc: "+collegeLoc);
    }
}
class Student{
    private int StudentID;
    public String StudentName;
    College studentCol;
    public Student(int StudentID, String StudentName, College studentCol){
        this.StudentID=StudentID;
        this.StudentName = StudentName;
        this.studentCol = studentCol;
    }
    public void displayStudentInfo(){
        System.out.println("Name: "+StudentName);
        System.out.println("ID: "+StudentID);
        System.out.println("College Information:");
        studentCol.collegeInfo();
    }
}
public class Main2 {
    public static void main(String[] args) {
        College col1 = new College("ABC University","New York");
        College col2 = new College("XYZ University","London");
        
        Student stu1 = new Student(1,"John Doe",col1);
        Student stu2 = new Student(2,"Somnath", col2);
        stu1.displayStudentInfo();
        System.out.println();
        stu2.displayStudentInfo();
    }
}
