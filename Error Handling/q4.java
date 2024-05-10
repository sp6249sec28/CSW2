// package Error Handling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class q4 {
    public static void main(String[] args) {
        String filepath = args[0];
        try{
            readContents(filepath);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found: " + e.getMessage());
        }
        catch(FileReaderPermissionException e){
            System.out.println("Permission required: " + e.getMessage());
        }
    }
    public static void readContents(String filePath) throws FileNotFoundException, FileReaderPermissionException{
        if(filePath==null){
            throw new NullPointerException("File path can't be empty");
        }
        File file = new File(filePath);
        if(!file.exists()) {
            throw new FileNotFoundException(filePath);
        }
        if(!file.canRead()){
            throw new FileReaderPermissionException(filePath);
        }
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println("Error reading file " + e.getMessage());
        }
    } 
}
class FileReaderPermissionException extends Exception{
    public FileReaderPermissionException(String filePath){
        super(filePath);
    }
    class FileNotFoundException extends java.io.FileNotFoundException{
        public FileNotFoundException(String filePath){
            super(filePath);
        }
    }
}
