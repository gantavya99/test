package dsaAdvanced;
public class twoDarray {
    public static void main(String[] args) {
        int m=5;
        
        int [][]a=new int[m][];
      
    }
    static void printSnake(int a[][],int r,int c){
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.println(a[i][j]+"  ");
                }
            }
            else
            for(int j=c-1;j>=0;j--){
                System.out.println(a[i][j]+"  ");
            }
        }
    }
}
   

