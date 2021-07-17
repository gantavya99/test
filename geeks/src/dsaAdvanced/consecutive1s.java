package dsaAdvanced;

public class consecutive1s {
    public static  void main(String[] args){
        int arr[]=new int[]{1,1,0,0,1,0,1,1,1,1,1,0};
        System.out.println(maxOnes(arr));
    }
    static int maxOnes(int arr[]){
        int n=arr.length;
        int count=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                count++;
                max=count;
                break;
               

            }
        }
        return Math.max(count, max);
        
        
    }
}
