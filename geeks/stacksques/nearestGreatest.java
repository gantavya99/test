package stacksques;
import java.util.*;
public class nearestGreatest {

public static ArrayList<Integer> nearest(int a[]){
    ArrayList<Integer> arl=new ArrayList<Integer>();
    Stack<Integer>s=new Stack<Integer>();
    int n=a.length;
    for(int i=n-1;i>=0;i--){
        if(s.size()==0){
            arl.add(-1);
        }
        else if(s.size()>0&&s.peek()>a[i]){
            arl.add(s.peek());
            
        }
       else if(s.size()>0&&s.peek()<=a[i]){
           while(s.size()>0&&s.peek()<=a[i]){
            if(s.size()==0){
                arl.add(-1);
            }
            else{
                arl.add(s.peek());

            }
           }

       }
       s.push(a[i]);
    }
  return arl;
   }

public static int[] nextLargerElement(int[] arr, int n)

{ 
    Stack<Integer> s = new Stack<>();              
    int nge[] = new int[n]; 
    for (int i = n - 1; i >= 0; i--)
    {     
        if (!s.empty()) 
        {               
            while (!s.empty() && s.peek() < arr[i]) {
                s.pop();                              
            } 
        } 
        if(s.empty()){
            nge[i]=-1;
        }  
        else{
            nge[i]=s.peek();
        }
        s.push(arr[i]);                     
    } 
    return nge;
} 
















public static int[] nearestGreaterLeft(int a[], int n){
    int res[]=new int[n];
            for(int i=1;i<n;i++){
                for(int j=i-1;j<=0;j--){
                    if(a[j]>a[i]){
                        res[i]=a[j];
                        break;
                    }
                    
                }
            }
            return res;
}

public static void main(String[] args) {
        int a[]=new int[]{1,3,2,4};
        int res[]=nearestGreaterLeft(a, a.length);
        for(int i:res){
            System.out.println(i);
        }
    
    }
}