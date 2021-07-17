package dsaAdvanced;

public class josephus {
    public static void main(String[] args){
        System.out.println(jos(5, 3));
    }
    static int jos(int n,int k){
        if(n==1){
            return 0;
        }
        return (jos(n-1,k)+k)%n;    

    }
}
