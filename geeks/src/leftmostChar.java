public class leftmostChar {
    public static int  charRepeat(String s){
        int n=s.length();
        int charac=-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    charac=i;
                    break;
                } 
                if(charac!=-1)
                break;  
            } 
        }
        return charac;
    }

        

        
    
    public static void main(String[] args){
        String s="Geeksforgeeks";
       int pos=charRepeat(s); 
       if(pos==-1){
           System.out.println("Not Found");
       }
       else
       System.out.println(s.charAt(pos));
      
    }
}

