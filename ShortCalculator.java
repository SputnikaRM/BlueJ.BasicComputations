import java.util.Scanner; 


public class ShortCalculator {
 
      Scanner input = new Scanner(System.in);
    System.out.println("Enter 2 short values between 0 and 65535");
    short x= input.nextShort();
    short y = input.nextShort();
    
    short sum = x + y;
    short difference = x - y;
    short product = x* y;
    short quotient = x / y;
    short remainder = x % y;
    
    System.out.println("The sum is" + sum); 
    System.out.println("The difference is " + difference);
    System.out.println("the product is "+ product);
    System.out.println("the quotient is " + quotient);
    System.out.println("the remainder is " + remainder);
    
    
    
    
}
