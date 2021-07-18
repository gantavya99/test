package crackingCodingInterview;

import java.util.HashSet;

public class arrayAndStrings{
   public static void main(String[] args) {
     String str="qwertyuiopasdfghjklzxcaaavbnm1234567890";
     System.out.println(isUnique(str));
   }
   static boolean isUnique(String str){
       for(int i=0;i<str.length();i++){
           for(int j=i+1;j<str.length();j++){
            if(str.charAt(i)==str.charAt(j)){
                return false;
            }
           }
       }
       return true;
   }
  static boolean isUniqueHashset(String str){
      HashSet<Character>s=new HashSet<>();
      int n=str.length();
        for(int i=0;i<n;i++){
            s.add(str.charAt(i));
            if(n==s.size()){
                return true;
            }
        }
        return false;
  }
   static boolean isUniqueCtCI(String str){
       if(str.length()>128){
           return false;
       }
       boolean[] charSet=new boolean[128];
       for(int i=0;i<str.length();i++){
           int val=str.charAt(i);
           if(charSet[val]){
               return false;
           }
           charSet[val]=true;
       }
       return true;
   }
}