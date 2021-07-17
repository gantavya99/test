import java.util.Scanner;

public class unique {
    static boolean isUnique(String str){
        if(str.length()>128)
            return false;
            boolean []Char=new boolean[128];
            for(int i=0;i<str.length();i++){
               int val=str.charAt(i);
               if(Char[val]){
                   return false;
               }
               Char[val]=true;

            }
            return true;
        
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a String");
        String s=sc.nextLine();
       System.out.println( isUnique(s));
       sc.close();
       
    }
}
