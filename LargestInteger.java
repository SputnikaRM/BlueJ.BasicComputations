import java.util.Scanner;  
import java.lang.Math;
import java.lang.*;

public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        Scanner num = new Scanner (System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int z = num.nextInt();
        int max = ((x > y) && (x > z)) ? x : ((y> x) && (y>z)) ? y : ((z>x) &&
        (z>y)) ? z: null;
        
        return max;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        Scanner num = new Scanner (System.in);
        int x = num.nextInt();
        int y = num.nextInt();
        int z = num.nextInt();
        int max = Math.max(x,(Math.max(y,z)));
        
        return max;
    }
}
