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
            s.pop();

            }
           }

       }
       s.push(a[i]);
    }
  return arl;
   }

public static ArrayList<Integer> nearestLargerLeft(int[] arr)

{ 
    int n=arr.length;
    Stack<Integer> s = new Stack<>();              
    ArrayList<Integer>arl=new ArrayList<>();
    for (int i = 0;i<n;i++)
    {     
        if (!s.empty()) 
        {               
            while (!s.empty() && s.peek() < arr[i]) {
                s.pop();                              
            } 
        } 
        if(s.empty()){
            arl.add(-1);
        }  
        else{
            arl.add(s.peek());
        }
        s.push(arr[i]);                     
    } 
    return arl;
} 

public static int[] bruteForce(int a[]){
    int n=a.length;
    int temp[]=new int[n];
    for(int i=0;i<n;i++){
        temp[i]=-1;
    }
    int k=0;
    for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
            if(a[j]>a[i]){
                temp[k++]=a[j];
                break;
            }
        } 
    }
    return temp;
}

public static ArrayList<Integer> stacksnearlarger(int a[]){
    int n=a.length;
    ArrayList<Integer>arl=new ArrayList<Integer>();
    int k=0;
    Stack<Integer>s=new Stack<Integer>();
    for(int i=n-1;i>=0;i--){
        if(s.empty()){
            arl.add(-1);
        }
        else if(!s.empty()&&s.peek()>a[i]){
            arl.add(s.peek());

        }
        else if(!s.empty()&&s.peek()<a[i]){
            while(!s.empty()&&s.peek()<a[i]){
                if(s.empty()){
                    arl.add(-1);
                }
                else{
                    s.pop();
                }
            }
        }
        s.push(a[i]);
        }
        return arl;
        
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
        ArrayList<Integer>temp=nearestLargerLeft(a);
        
        for(int i:temp){
            System.out.println(i);
        }
    
    }
}
