public class quicksort {
    static int Lpartition(int a[],int l,int h){
        int pivot = a[h];//last element is pivot for easier understanding of the program
        //now we take two pointer approach and take i&j as pointers, now declare their values 
        //respectively
        int i=l-1;
        for(int j=l;j<=h-1;j++){
            if(a[j]<pivot)
            {
                i++;
                swap(a[i],a[j]);
            }
           
        }

        swap(a[i+1],a[h]);
        return i+1;
        
    }
    static void quickSort(int[] arr, int low, int high)
{
    if (low < high)
    {
         
        // pi is partitioning index, arr[p]
        // is now at right place
        int pi = Lpartition(arr, low, high);
 
        // Separately sort elements before
        // partition and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
static void swap( int i, int j)
{
    int temp=i;
    i=j;
    j=temp;

}
    public static void main(String[] args){
        int a[]=new int[]{10,80,30,90,40,50,70};
        quickSort(a, 0, a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
        
    }


  
    
}
