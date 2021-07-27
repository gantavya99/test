package crackingCodingInterview;
import java.util.*;
public class twoDarray {
    public static void main(String[] args) {
     int a[]=new int[]{23,12,45,62,12,1,56};
     
     System.out.println(Arrays.toString(placement(a.length, a)));

    }
    public static int[] placement(int input1,int input2[]){
        input1=input2.length;
        int count=0;
        int res[]=new int[input1];
        for(int i=0;i<input1;i++){
           for(int j=1;j<input1;j++){
               if(input2[i]<input2[j]){
                   count++;
                   res[i]=count;
               }
            }
            count=0;
        }
        return res;

    }
}
