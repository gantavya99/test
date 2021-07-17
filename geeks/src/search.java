public class search {

    static int binarySearch(int a[],int key){
        int n=a.length;
        int s=0;
        int e=n;
        while(s<=e){
            int mid=(s+e)/2;
            if(key==a[mid])
            return mid;
            else if(key>a[mid])
            {
                s=mid+1;
            }
            else
            e=mid-1;

        }
        return -1;
    }


    public static void main(String[] args){
        int a[]=new int[]{23,34,56,78,98,567};
        int key=6768;
        System.out.println(binarySearch(a, key));


    }
    
}
