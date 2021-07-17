import java.util.*;
public class insertionSort {
    static void secondLarget(int a[]){

        
        for(int i=0;i<a.length;i++){
            Arrays.sort(a);  
        }
        System.out.println(a[a.length-2]);
       
    }
   static void reverseArray(int a[]){
        int n=a.length;
        int low =0;int high=n-1;
        while(low<high){
            int temp=a[low];
            a[low]=a[high];
            a[high]=temp;
            low++;
            high--;

        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int a[]= new int[]{43,56,72,89,76};
           extracted(a);
        
      
    }
    private static void extracted(int[] a) {
        reverseArray(a);
    }
}
