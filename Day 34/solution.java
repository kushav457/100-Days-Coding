class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        long pre=1;
        long suff=1;
        long  ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(pre==0)
            {
                pre=1;
            }
            if(suff==0)
            {
                suff=1;
            }
            pre=pre*arr[i];
            suff=suff*arr[n-i-1];
            ans=Math.max(ans,Math.max(pre,suff));
        }
        return ans;
}}