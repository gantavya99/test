public class binary {
    public static void rotateBinary(int a[]){
        
        int n=a.length;
        int res[] = new int[n];
        for(int i=0;i<n;i++){

		
		    while(a[i]>0){
			res[i]=res[i]<<1; 		
			res[i] = res[i]|(a[i] & 1); 			
			a[i]=a[i]>>1;
		}
        
    }
    
		
    
	}
	public static void main(String args[]){
		int x[] =new int[]{32768,101200,262244};
		rotateBinary(x);
        for(int i:x)
        System.out.println(i);

        }
	}
    

