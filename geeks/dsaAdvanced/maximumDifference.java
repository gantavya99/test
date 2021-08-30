package dsaAdvanced;

public class maximumDifference {
    public static void main(String[] args) {
        int a[]=new int[]{2,3,10,6,4,8,1};
        System.out.println(maxDifference(a));
    }
    static int maxDifference(int a[]){
      int n=a.length;
      int res=a[1]=a[0];
      int minVal=a[0];
      for(int i=1;i<n;i++){
        res=Math.max(res, a[i]-minVal);
      }
      return res;
    }
}
