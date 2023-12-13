/**
 * Write a Java program that demonstrates the use of the try, catch, and finally blocks to handle exceptions. 
 * Include a custom exception class and throw an instance of it. 
 */

package Academic_Excellence_Exam_From_Anudeep_Fundation;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


// Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    public static void main(String[] args) {

        try{
            //diving by 0 give exception
            int a = (10/0);

            //If file does not found then FileNotFoundException exception throw
            String filepath = "output1.txt";
            FileReader fileReader = new FileReader(filepath) ;

            fileReader.read();
            fileReader.close();           

        }catch(ArithmeticException ae){
            //diving by 0 give exception to hendle this Arithmetic Expception are used
            System.out.println("Arithmetc Exception  Example : " + ae.getMessage());
        }catch(FileNotFoundException fe){
            //If file does not found then FileNotFoundException exception throw
            System.out.println("FileNotFound Exception  Example : " + fe.getMessage());
        }
        catch(IOException io){
            //To hendel IOException
            System.out.println("IO Exception:"+ io.getMessage());
        }        
        finally{
            //Here we are using custom Exception if not get from any catch
            System.out.println( new CustomException("Finally block run all time"));     
        }
    }    
}
/*******Output*********/
// FileNotFound Exception  Example : output1.txt (The system cannot find the file specified)
// Academic_Excellence_Exam_From_Anudeep_Fundation.CustomException: Finally block run all time