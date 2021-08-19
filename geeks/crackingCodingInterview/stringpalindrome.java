package crackingCodingInterview;

public class stringpalindrome {
    public static void main(String[] args) {
        String s1="racecar";
        System.out.println(stringPal(s1));
    }
    static boolean stringPal(String str){
        int n=str.length();
        for(int i=0;i<n/2;i++){
            for(int j=n/2-1;j>0;j--){
                if(str.charAt(i)==str.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
