public class leetcode {

    public static void main(String[] args) {
        
    }

    public static int[] shuffle(int[] nums, int n) {
        int a[] = new int[2*n];
        int j=0;
        for(int i=0;i<n;i++){
        a[j++] = nums[i];
        a[j++] = nums[i+n];
        }
        return a;
        
    }
    public static int strStr(String haystack, String needle) {
        char i;
        for( i=0;i<haystack.length();i++){
            for(char j=1;j<haystack.length();j++){
                if(haystack.substring(i)==needle.substring(j)){
                    return i;
                }
            }
        }
        return haystack.indexOf(i);
        }
}  