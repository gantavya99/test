package crackingCodingInterview;

public class urlify {
    public static void main(String[] args) {
        String str="Mr John Smith   ";
        str=str.trim();//removes all the spaces from the ends and the start
    
       str= str.replaceAll("\\s","%20");
        System.out.println(str);
    }
    static int maxProduct(int a[]){
        int n=a.length;
        int product=0;
        int max=0;
        for(int i=0;i<n;i++){
            product=a[i]*a[i+1];
        }
    }

}
