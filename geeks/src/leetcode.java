import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class leetcode {

    public static void main(String[] args) {
        int a[]=new int[]{2,2,2,4,5,7,7,7,8,13};
        removeDuplicates(a);
        for(int i:a){
            System.out.print(i);
        }
    }
    public static boolean checkIfExist(int[] arr) {
        //N=2*M.
       Set<Integer>s=new HashSet<Integer>();
       for(int i:arr){
           
        if (s.contains(i*2) || ((i%2==0) && s.contains(i/2))){
            return true;
        }
       }
       return false;

    }
       public static boolean mountainArray(int arr[]){
           int n=arr.length;
           
           
           for(int i=1;i<n;i++){
               if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]){
                return true;
               }
           }
           return false;

       }
       public int[] replaceElements2(int[] A) {
        int mx = -1, n = A.length, a;
        for (int i = n - 1; i >= 0; --i) {
            a = A[i];
            A[i] = mx;
            mx = Math.max(mx, a);
        }
        return A;
    }
    public static int[] removeDuplicates(int[] arr)  {
        int n=arr.length;
        if (n == 0 || n == 1)
            return arr;
        int j = 0;
        for (int i = 0; i < n-1; i++){
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
        }
      
        arr[j++] = arr[n-1];
      
        return arr;
    }
   
   
   
   
   
   
   
   
   
   
   public static String[] catchword(String []str){
        
   }
}
    

 