package crackingCodingInterview;

import java.util.Arrays;

public class checkpermutaion {
    public static void main(String[] args) {
        
    }
     static boolean checkpermutaions(String s1,String s2){
        int c[]=new int[s2.length()];
        for(int i=0;i<s2.length();i++){
            c[i]=s2.charAt(i);
        }
        Arrays.sort(c);
        for(int i=0;i<s2.length();i++){
            if(s1.charAt(i)==c[i]){
                return true;
            }
        }
        return false;

    }
}
