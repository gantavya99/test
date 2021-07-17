package dsaAdvanced;

public class leftRotate {
    public static void main(String[] args){
        int a[]=new int[]{1,2,3,4,5};
        leftRotateOptimisedSolution(a, 2);
        for(int i:a){
            System.out.println(i);
        }
        
    }
    static void leftRotateOne(int a[],int n){
        
        int temp=a[0];
        for(int i=1;i<n;i++){
            a[i-1]=a[i];
           
        }
        a[n-1]=temp;
    }
    static void leftRotate(int a[],int n,int d){
        for(int i=0;i<d;i++){
            leftRotateOne(a,n);
        }
        for(int i:a){
            System.out.println(i);
        }
    }
    static void leftRotateOptimisedSolution(int a[], int d){
        int temp[]= new int[d];
        int n=a.length;
        for(int i=0;i<d;i++){
            temp[i]=a[i];
        }
        for(int i=d;i<n;i++){
            a[i-d]=a[i];
        }
        for(int i=0;i<d;i++){
            a[n-d+i]=temp[i];
        }
    }
}
