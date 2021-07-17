package dsaAdvanced;

public class kadane {
    public static void main(String[] args) {
        int a[]=new int[]{1,-2,3,-1,2};
        System.out.println(maxSum(a));
    }
    static int maxSum(int a[]){
        int n=a.length;
        int res=a[0];
        int maxEnding=a[0];
        for(int i=1;i<n;i++){
            maxEnding=Math.max((maxEnding+a[i]),a[i]);
            res=Math.max(res,maxEnding)
            ;
        }
        return res;
    }
}
