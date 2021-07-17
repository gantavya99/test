// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;

public class sort {
    static void mergeSort(int arr[],int l,int r){
        if(r>l){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            
            
        }
    }

    static void merge(int a[],int b[],int m,int n){
        int i=0;int j=0;
        while(i<m && j<n){
            if(a[i]<b[j])
            System.out.println(a[i++]+" ");
            else
            System.out.println(b[j++]+" ");
        }
        while(i<m)
        System.out.println(a[i++]+" ");
        while(j<n)
        System.out.println(b[j++]+" ");
    }
    public static void main(String[] args){
        int x[]=new int[]{2,3,56,67};
        int y[]=new int[]{1,8,987,4563};
        int m=x.length;
        int n=y.length;
        merge(x,y,m,n);
    }
}
