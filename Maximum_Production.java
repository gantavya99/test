
import java.util.*;
public class Maximum_Production {
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    int d=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int z=sc.nextInt();
    
    
    while(t-->0){
        int first=x*7;
        int second=(y*d)+((7-d)*z);
        int result=Math.max(first, second);
    System.out.println(result);
     }
}

}
