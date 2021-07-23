package crackingCodingInterview;

public class rabinkarp {
    public final static int d=10;
    public static void main(String[] args) {
        String s1="ababababc";
        String s2="bc";
        rabinkarpAlgo(s2, s1, 13);
    }
    public static void rabinkarpAlgo(String pattern, String text, int q){
        int m=pattern.length();
        int n=text.length();
        int p=0;//hash value of pattern
        int t=0;//hash value of text
        int h=1;
        for(int i=0;i<m-1;i++){
            h=(h*d)%q;
        }
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + text.charAt(i)) % q;
          }
         for(int i=0;i<=n-m;i++){
             if(p==t){
                 boolean flag = true;
                 for(int j=0;j<m;j++){
                     if(text.charAt(i+j)!=pattern.charAt(j)){
                        flag =false;
                        break;  
                     }
                     ;
                 }
                 if(flag==true){
                     System.out.println("Pattern is present at index "+i);
                 }
             }
             if(i<n-m){
                 t=((d*(t-text.charAt(i)*h)+text.charAt(i+m)))%q;
                 if(t<0){
                     t=t+q;
                 }
             }
         }
    }

}
