class Solution
{
    //Function to find maximum of each subarray of size k.
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
          ArrayList<Integer> sub = new ArrayList<>();
        int i = 0;
        while (i <= n - k) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            
            sub.add(max);
            i = i + 1;
        }
        
        return sub;
    }
}