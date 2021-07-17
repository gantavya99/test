package searchingAdvanced;
import java.util.*;
public class indexfirst {
   
    public static void main(String[] args) {
        int a[]=new int[]{1,10,10,10,20,20,40};
        System.out.println(binarySearch(a, 20,0,a.length-1));
    }
    static int firstIndex(int a[],int x){
        int n=a.length;
        int res=0;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                res=i;
                break;
            }
        }
        return res;
    }
    static int binarySearch(int a[],int x,int low,int high){
        int n=a.length;
        Arrays.sort(a);
         if(high>=low){
        int mid=(low+high)/2;
         
        if(a[mid]==x){
            return mid;
        }
        else if(x>a[mid]){
            binarySearch(a, x,mid+1,high);
        }
        else if(x<a[mid]  ){
            binarySearch(a,x, low, mid-1);
        }
    }
        return -1;
    }
}

