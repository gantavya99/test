package dsaAdvanced;

import java.util.HashSet;

public class hashin {
    public static void main(String[] args) {
        int a[]=new int[]{1,4,13,-3,-10,5};
        System.out.println(isSum(a,576));
    }
    static int intersection(int a[],int b[],int m, int n){
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<m;i++){
            s.add(a[i]);
        }
        int res=0;
        for(int j=0;j<n;j++){
            if(s.contains(b[j])){
                res++;
            }
        }
        return res;
    }
    static int union(int a[],int b[],int m,int n){

        HashSet<Integer>s=new HashSet<Integer>();
        int res=0;int res1=0;
        for(int i=0;i<m;i++){
            
            s.add(a[i]);
            res++;

        }
        for(int j=0;j<n;j++){
            s.add(b[j]);
            res1++;
        }
        return res+res1;
    }
    static boolean givenSumPair(int a[],int sum){
        int n=a.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(a[i]+a[j]==sum){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean isSum(int a[],int sum){
        int n=a.length;
        int preSum=0;
        HashSet<Integer>s=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            preSum+=a[i];
            if(s.contains(preSum=sum)){
                return true;
            }
            
            s.add(preSum);
           
        }
        return false;
    }
    
}
