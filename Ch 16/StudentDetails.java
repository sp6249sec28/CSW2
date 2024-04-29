// package Ch 16;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("student_data.txt");
            for(int i=0;i<10;i++){
                System.out.print("Enter registration number for student "+(i+1) + ": ");
                String regNo = sc.nextLine();
                System.out.print("Enter name for student "+(i+1) + ": ");
                String name = sc.nextLine();
                System.out.print("Enter date of birth for student "+(i+11) + " (DD-MM-YYYY): ");
                String dob = sc.nextLine();
                String upperCase = name.toUpperCase();
                writer.write(regNo + ", " + upperCase+ ", "+ dob + "\n");
            }
            writer.close();
            System.out.println("Student data has been successfully written to file.");
        }catch(IOException e){
            System.out.println("Error occured while writing to the file.");
        }
        try{
            FileWriter writer = new FileWriter("student_data.txt");
            for(int i=0;i<5;i++){
                System.out.print("Enter registration number for student "+(i+11) + ": ");
                String regNo = sc.nextLine();
                System.out.print("Enter name for student "+(i+11) + ": ");
                String name = sc.nextLine();
                System.out.print("Enter date of birth for student "+(i+11) + " (DD-MM-YYYY): ");
                String dob = sc.nextLine();
                String upperCase = name.toUpperCase();
                writer.write(regNo + ", " + upperCase+ ", "+ dob + "\n");
            }
            writer.close();
            System.out.println("Student data(name in Uppercase) has been successfully written to file.");
        }catch(IOException e){
            System.out.println("Error occured while writing to the file.");
        }

        try{
            FileReader reader = new FileReader("student_data.txt");
            BufferedReader buffer = new BufferedReader(reader);
            int count = 0;
            String line;
            while((line = buffer.readLine()) != null){
                String[] parts = line.split(",");
                System.out.print("Reg No: " + parts[0]);
                System.out.print("Name: " + parts[1]);
                System.out.println("DOB: " + parts[2]);
                count++;
                
            }
            buffer.close();
            System.out.println("No of students in the class: "+ count);
        }catch(IOException e){
            System.out.println("Error occured while writing to the file.");
        }
    }    
}
