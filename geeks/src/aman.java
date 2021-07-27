public class aman {
    public static void main(String[] args) {
        
    

    int a[]=new int[]{1,5,10,20,100,500,2000};
    int notes[]=new int[7];
    int x=250;
    int y=2000;
    int result=y-x;
    for(int i=6;i>0;i--){
        if(result>=a[i]){
            notes[i]=result/a[i];
            result=result-notes[i]*a[i];
        }
    }
    for (int i = 0; i<7; i++) {
            System.out.println("NOtes of denomination"+a[i]+":"+notes[i]);
    }
   
}
}
