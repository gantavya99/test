package dsaAdvanced;

public class leaderArray {
    public static void main(String[] args){
        int a[]=new int[]{7,10,4,10,6,5,2};
        leaderArray(a);
       
        
    } 
    static void leaderArray(int a[]){
       int n=a.length;
       for(int i=0;i<n;i++){
           boolean flag=true;
           for(int j=i+1;j<n;j++){
               if(a[i]<=a[j]){
                   flag=false;
                   break;
               }
           }
           if(flag==true){
               System.out.println(a[i]);
           }
       }
    }
}
