class Solution 
{ 
	public static long[] productExceptSelf(int nums[], int n) 
	{ 
        // code here
         long[] productArray = new long[n];
        
        for(int i=0;i<n;i++){
            long c=1;
            
            for(int j=0;j<n;j++){
                
                if(i!=j){
                    c*=nums[j];
                }
            }
            
            productArray[i]=c;
        }
        return productArray;
	} 
} 