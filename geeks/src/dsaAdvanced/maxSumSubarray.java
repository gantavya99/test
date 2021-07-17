package dsaAdvanced;

public class maxSumSubarray {
    public static void main(String[] args) {
        int a[]=new int[]{1,-2,3,-1,2};
        int n=a.length;
        int res=a[0];
        for(int i=0;i<n;i++){
            int curr=0;
            for(int j=i;j<n;j++){
                curr=curr+a[i];
               res=Math.max(curr,res);
            }
        }
        System.out.println(res);
    }
}
