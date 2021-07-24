package crackingCodingInterview;

import java.util.HashSet;
import java.util.Set;

public class palindromepermutation {
    
    public static void main(String[] args) {
        String str="gantavya";
       System.out.println(checkpermutation(str));
        
    }

    public static boolean checkpermutation(String str){
       int [] ch=new int[128];
       for(int i=0;i<str.length();i++){
           ch[str.charAt(i)]++;
       }
       int count=0;
       for(int i=0;i<ch.length;i++){
           count+=ch[i]%2;
       }
       return count<=1;
       
}
}
