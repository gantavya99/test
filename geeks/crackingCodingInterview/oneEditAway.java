package crackingCodingInterview;

public class oneEditAway {
    public static void main(String[] args) {
       String s1="yellow";
       String s2="tellow";
       System.out.println(oneAway(s1, s2));
        
    }
    static boolean oneAway(String s1, String s2){
        if(s1.equalsIgnoreCase(s2)==true){
            return true;
        }
        if(s1.length()==s2.length()){
            return oneEditReplace(s1,s2);
        }
        else if(s1.length()+1==s2.length()){
            return oneEditInsert(s1,s2);
        }
        else if(s1.length()-1==s2.length()){
            return oneEditInsert(s2,s1);
        }
        return false;
        }
    static boolean oneEditReplace(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
               count++;
        }
    }
        return count==1; 
    }
    static boolean oneEditInsert(String s1, String s2){
            int index1=0;
            int index2=0;
            while(index1<s1.length()&&index2<s2.length()){
                if(s1.charAt(index1)!=s2.charAt(index2)){
                    if(index1!=index2){
                        return false;
                    }
                    index2++;
                }
                else{
                    index1++;
                    index2++;
                }
            }
            return true;
        } 
    } 
    


