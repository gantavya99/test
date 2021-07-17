    import java.util.*;
public class patterns {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println(" Enter the value of n");
         int n=sc.nextInt();
      

         

    }
    static void rectangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void rightAnglepyramid(int n){

        for(int i=0;i<n;i++){
            System.out.print(" ");
        
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
        }
    }
    static void degree180pyramid(int n){
        
    }
}

