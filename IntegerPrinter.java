import java.util.Scanner;  
import java.lang.Math; 
import java.lang.Integer;

public class IntegerPrinter {
    
    public static void main(String[] args){
        Scanner s = new Scanner (System.in);
        System.out.println ("Enter an integer please");
        int value = s.nextInt();

    }

    public String printIntegerAsBinary(int value){
        return Integer.toBinaryString(value); 
         
        
   }

    public String printIntegerAsOctal(int value){
        return Integer.toOctalString(value);
    }

    public String printIntegerAsHexadecimal(int value){
        return Integer.toHexString(value);
    }
}
