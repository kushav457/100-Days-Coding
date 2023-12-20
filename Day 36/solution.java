class Solution
{
    //Function to find if there exists a triplet in the 
    //array A[] which sums up to X.
    public static boolean find3Numbers(int arr[], int n, int X) { 
    
       // Your code Here
     Arrays.sort(arr); 
       int sum =0;
       // Have a for loop to track first element
       for (int i=0; i<n;i++){
            int l = i+1, r = n-1;
        // Use 2 pointers l and r to track i+1 and n-1 elements.
        while (l < r){
              sum = arr[i] + arr[l] + arr[r];
              if (sum == X) return true;
              else if (sum > X) r--;
              else if (sum < X) l++;
        }
        
       }
       return false;
    }
}