package dsaAdvanced;

public class zeroesEnd {
    public static void main(String[] args){
        int a[]=new int[]{2,0,3,0,4,5,0,0};
        
      }
    
    static void zeroesToEnd(int a[]){
        int n= a.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                swap(a[i], a[count]);
                count++; 
        }
    } 

    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

}
