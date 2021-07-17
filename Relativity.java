import java.util.*;
public class Relativity{
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        try{
            int g=sc.nextInt();
            int c=sc.nextInt();
            int h=(c*c)/(2*g);
            System.out.println(h);





        }
        catch(Exception e){
            return ;
        }
    }
    }
}