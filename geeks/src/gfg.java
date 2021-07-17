import java.util.*;

import jdk.tools.jlink.internal.SymLinkResourcePoolEntry;

import java.lang.*;
import java.io.*;

class gfg {
	public static void main (String[] args) {
		String str="geeks";
        System.out.println(insert(str));
        


		}
		public static int fib(int n){
            
            if(n<=1){
                return n;
            }
            return fib(n-1)+fib(n-2);
        }
		
        public static int bunnyEars(int bunnies) {
            if(bunnies==0){
                return 0;
            }
            return 2+(bunnyEars(bunnies-1));
        }
        
        public static int sumArray(int[] a,int n){
            
           
            
                if(n<=0){
                    return 0;
                }
                return sumArray(a,n-1)+a[n-1];
            

        }
	
    

        public static int digitSum(int n){
    if(n<=0){
        return 0;
    }
    return digitSum(n/10)+n%10;
}

        public static String insert(String str){
            char[] ch= new char[str.length()];
            for(int i=0;i<str.length();i++){
                ch[i]=str.charAt(i);    
            }
            for(int j=0;j<ch.length-1;j++){
                if(ch[j]==ch[j+1]){
                    ch[j+1]='*';
                    
                }
               
            }
            return toString(ch);
            
            }
            public static String toString(char[] ch){
                String string= new String(ch);
                return string;
            }
        }
