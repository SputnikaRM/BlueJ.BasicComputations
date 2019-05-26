 import java.math.BigInteger;
 import java.util.Scanner;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        Scanner z = new Scanner (System.in);
        int n = z.nextInt();
        
        BigInteger x = new BigInteger("1");
        for (int y=2; y <= n; y++) {
        x=x.multiply(BigInteger.valueOf(y));
        
        
    }
    return x;
}

}
