import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args){
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter the size of array");
           int n=sc.nextInt();
           int a[]=new int[n];
           System.out.println("Enter the elemnets of an array");
           for(int i=0;i<n;i++){
               a[i]= sc.nextInt();
           }
           for(int i=0;i<n-1;i++){
               int minIndex=i;
               for(int j=i+1;j<n;j++){
                   if(a[j]<a[minIndex])
                   minIndex=j;
               }
               int temp=a[minIndex];
               a[minIndex]=a[i];
               a[i]=temp;
           }
           for(int k:a){
               System.out.print(k+" ");
           }
            }
            
    }

