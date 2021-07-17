package stacks;
import java.util.*;
public class infix {
    public static void main(String[] args){
    long a[]=new long[]{1,2,3,4,5,45464564,34232342,234234,23232342342342342342342342};
    System.out.println(arraySum(a,a.length));
    }
    static long arraySum(long[] a, int n){
        
        
        
        if(n<=0){
            return 0;
        }
        return (arraySum(a,n-1)+a[n-1]);
    
    }
}
