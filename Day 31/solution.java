class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static long trappingWater(int arr[], int n) { 
        // Your code here
          int left[]= new int[n];
        int right[]= new int[n];
        int tp=0;
        left[0]=arr[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(arr[i],right[i+1]);
        }
        for(int i=0;i<n;i++){
            int water=Math.min(left[i],right[i]);
            tp=tp+water-arr[i];
        }
        return tp;
    } 
}