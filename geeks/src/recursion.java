//import java.util.Arrays;//
public class recursion
{
    public static void sum(int n){
        if(n==0){
            return;
        }
        sum(n-1);

        System.out.println(n);
        



    }
   public static int fact(int n) 
       {
           if(n==0){
               return 1;
           }
           return fact(n-1)*n;
       }
       public static int sum(int a[], int n){
            if(n<0){
                return 0;
            }

        return a[n]+sum(a,n-1);
       }
   public static int fib(int n){
       if(n<=1){
           return n;
       }
       return fib(n-1)+fib(n-2);
       
    
   }      
//in fiboancci series , to get n we add (n-1)+(n-2)
    public static void main(String[] args){
        int a[]=new int[]{1,1,1,1,1,1};
     
     // System.out.println(sum(a, a.length-3));
     System.out.println(fib(6));
       
    
    }
}
