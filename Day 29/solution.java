class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
         int counter = 0;
        int smallest = 0;
        int kthSmallest = 0;
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length ; i++) {
            if(arr[i] > smallest) {
                smallest = arr[i];
                counter++;
            }
            if (counter == k) {
                kthSmallest = arr[i];
                break;
            }
        }
    return kthSmallest;   
    } 
}
