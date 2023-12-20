class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
         Arrays.sort(arr);
        Arrays.sort(dep);
        int max=Integer.MIN_VALUE;
        int count=0;
        int p=0;
        int d=0;
        while(p<arr.length && d<dep.length){
            if(arr[p]<=dep[d]){
                count++;
                p++;
                max=Math.max(max,count);
            }else{
                count--;
                d++;
            }
        }
        return max;
        
    }