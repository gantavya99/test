public class deletion {

    
        public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=val)
        {
            nums[count++]=nums[i];
        }
        
        }
            return count;
        }
        
       
        
          

      

       
       
   
    public static void main(String[] args){
        int []a=new int[]{1,23,4,5,6,7};
        delete(a,4);
        for(int i:a){
            System.out.println(i);
        }
    }
   }