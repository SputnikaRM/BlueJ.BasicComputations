import java.lang.Math; 
 
public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
          Integer x = 0;
         if ((angle % 360) >= 0) {
            return angle % 360;
            }else return angle + 360;
            
        
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int x= Math.floorMod(integer, 360);
        
        if (x > 0) {
        return x;
        } else x+=360;
        return x;
        
    }

    public static void main(String[] args){

    }
}
