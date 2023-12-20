class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
        // code here
          ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int profit = 0;
        int buy_price = A[0];
        int buy_day = 0;
        for(int i=1;i<n;i++){
            if(A[i]<buy_price){
                buy_price = A[i];
                buy_day = i;
            }
            else{
                profit += A[i] - buy_price;
                res.add(new ArrayList<>(Arrays.asList(buy_day,i)));
                buy_price = A[i];
                buy_day = i;
            }
        }
        return res;
    }
}