// package Ch 16;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        //1. Create a new File
        File file = new File("shivam6249.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created successfully.");
            }else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("Error creating file: " + e.getMessage());
        }

        //2. Check if a file exists
        if(file.exists()){
            System.out.println("File exists.");
        }else{
            System.out.println("File doesn't exist.");
        }

        //3. Write data to the file
        try{
            FileWriter writer = new FileWriter(file);
            writer.write("This is some data firstly written.");
            writer.write("Adding another line to the file.");
            writer.close(); //Important to close the writer
            System.out.println("Data written to the file successfully.");
        }catch(IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }

        //4.Read data from the file
        try{
            FileReader reader = new FileReader(file);
            Scanner sc = new Scanner(reader);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            reader.close();
        }catch(IOException e){
            System.out.println("Error reading from file: " + e.getMessage());
        }

        //5.Append data to file(assuming the file already exists.)
        try{
            FileWriter writer = new FileWriter(file, true);
            writer.write("\nAppending more data...");
            writer.close();
            System.out.println("Data appended to the file successfully.");
        }catch(IOException e){
            System.out.println("Error appending to file: " + e.getMessage());
        }

        //6. Deleting the file
        if(file.delete()){
            System.out.println("File deleted successfully");
        }else{
            System.out.println("Failed to delete.");
        }
    }    
}
