package dsaAdvanced;
public class hashmap {
    public static void main(String[] args) {
        int a[]=new int []{1,0,1,1,1,0,0};
        System.out.println(equalOnesAndZeroes(a));
    }
    static int equalOnesAndZeroes(int a[]){
        int n=a.length;
       
        int res=0;
        for(int i=0;i<n;i++){
            int c0=0;
            int c1=0;
            for(int j=i;j<n;j++){
                if(a[j]==0){
                    c0++;
                }
                else{
                    c1++;
                }
                if(c0==c1){
                    res=Math.max(res, j-i+1);
                }
            }
        }
        return res;

    }
}
