import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class leetcode {

    public static void main(String[] args) {
        int a[]=new int[]{10,2,5,3};
        System.out.println(checkIfExist(a));
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
           int j;
           
           for(int i=1;i<n;i++){
               if(arr[i]>arr[i-1]&&arr[i]<arr[i+1]){
                return true;
               }
           }
           return false;

       }
      
    }

 