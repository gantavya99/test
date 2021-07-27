import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
       //matrix multiplication
       Scanner sc =new Scanner(System.in);
       int r1=3;int c1=3;int r2=4;int c2=3;
       int a[][]=new int[r1][c1];
       int b[][]=new int[r2][c2];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                b[i][j]=sc.nextInt();
            }
        }
        if(r1!=c2){
            System.out.println("Invalid Input");
            return;
        }
        int prod[][]=new int[r1][c2];
        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                for(int k=0;k<c1;k++){
                    prod[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        for(int i=0;i<prod.length;i++){
            for(int j=0;j<prod[0].length;j++){
                System.out.print(prod[i][j]+" ");
            }
            System.out.println();
        }


    } 
}
