package crackingCodingInterview;

public class oneEditAway {
    public static void main(String[] args) {
       
        
    }
    static boolean oneAway(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)==true){
            return true;
        }
        char[] ch=new char[27];
        for(int i=0;i<128;i++){
            ch[i]=(char)(97+i);
            if(s2.concat(ch(i))==s1){
                return true;
            }
        }
        if(s2.)


    }
    private static String ch(int i) {
        return null;
    }
}
