// package Error Handling;

public class q1q2q3 {

    class CustomNullPointerException extends NullPointerException{
        public CustomNullPointerException(String message){
            super(message);
        }
    }
    public static void main(String[] args) throws Exception {
        String input = "hello12222222";
        try{
            displayChar(input);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        try{
            String nullString = null;
            displayChar(nullString);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        try{
            String emptyString = "";
            displayChar(emptyString);
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
        try{
            String str = null;
            if(str==null){
                throw new Exception("Custom Null Pointer Exception occured.");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void displayChar(String str){
        if (str == null || str.isEmpty()){
            throw new NullPointerException("Input Cannot be null or empty.");
        }
        boolean found = false;
        for(int i=2;i<str.length()-2;i+=3){
            char prevChar = str.charAt(i-2);
            char currChar = str.charAt(i);
            char nextChar = str.charAt(i+1);
            
            if(isVowel(prevChar) && !Character.isDigit(prevChar) && Character.isDigit(currChar)){
                System.out.println(currChar);
                found=true;
            }
        }
        if(!found){
            System.out.println("No numeric characters preceded by vowels or consonants.");
        }
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
