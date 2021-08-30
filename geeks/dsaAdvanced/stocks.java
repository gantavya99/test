package dsaAdvanced;

import java.util.ArrayList;

public class stocks {
    public static void main(String[] args) {
        int a[]=new int[]{1,5,3,8,12};
        System.out.println(stock(a));
    }
    static int stock(int a[]){
        int n=a.length;
        int result=0;
        int temp[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[j]>a[i]){
                    temp[i]=a[j]-a[i];
                    break;
                }
            }
            
        }
        for(int i=0;i<n;i++){
                result+=a[i];
        }
        return result;
        
    }
}
