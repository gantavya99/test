import java.util.Arrays;

//import java.util.Arrays;

public class mergeSort {
        public static void main(String[] args){
            int a[]= new int[]{4,56,3,2,1};
            mergeSort(a, 0, 4);
            for(int i:a){
                System.out.println(i);
            }
    }
    static void mergeSort(int a[], int l, int r){
        if(r>l){
        int m=l+(r-l)/2;
        mergeSort(a,l,m);
        mergeSort(a,m+1,r);
        merge( a,l,m,r);
        }
    }  
    static void merge(int a[], int l, int m, int r)  {
        int n1=m-l+1;
        int n2=r-m;
        int []left= new int[n1];
        int []right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=a[l+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=a[m+1+j];
        }
        int i=0,j=0;
        int k=l;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                a[k++]=left[i++];
            }
            else{
                a[k++]=right[j++];
            }
        }
        while(i<n1){
            a[k++]=left[i++];
        }
        while(j<n2){
            a[k++]=right[j++];
        }
    }
}
    


