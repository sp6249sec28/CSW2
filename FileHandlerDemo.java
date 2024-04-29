// package Ch 16;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class FileHandlerDemo {
    public static void main(String[] args) {
        //1. Create a File Object
        File myfile = new File("shivam6249_2.txt");
        
        //2. Check if file exists
        if(myfile.exists()){
            System.out.println("File exists: "+ myfile.getAbsolutePath());
        }else{
            System.out.println("File does not exist yet.");
        }
        
        //3. Create a new file
        try{
            myfile.createNewFile();
            System.out.println("File created successfully.");
        }catch(IOException e){
            System.out.println("Error creating file: "+ e.getMessage());
        }

        //4.Write data to the file
        try{
            FileWriter writer = new FileWriter(myfile);
            writer.write("This is some data firstly written.\n");
            writer.write("Adding another line to the file.\n");
            writer.close(); //Important to close the writer
            System.out.println("Data written to the file successfully.");
        }catch(IOException e){
            System.out.println("Error writing to file: " + e.getMessage());
        }

        //5.Read data from the file
        try{
            Scanner sc = new Scanner(myfile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
            System.out.println("Data read from the file successfully.");
        }catch(FileNotFoundException e){
            System.out.println("Error reading from file: File not found");
        }

        //6. Delete the file
        if(myfile.delete()){
            System.out.println("File deleted successfully.");
        }else{
            System.out.println("Failed to delete the file.");
        }
    }    
}
