package trees;
import java.util.*;

public class leftRotate {
 public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int t=sc.nextInt();
   while(t-->0){
      
       int N=sc.nextInt();
       int D=sc.nextInt();
   int arr[] = new int[N];
   for(int i=0;i<N;i++){
       arr[i]=sc.nextInt();
   }
   int temp=arr[N];
   for(int i=0;i<N;i++){
       arr[i-D]=arr[i];
       arr[N-D]=temp;
       
   }
 }   
}
}
