class Compute  
{ 
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        TreeMap<Integer, ArrayList<Integer>> map = new TreeMap<>();
        
        for(int i=0; i<n; i++){
            int num = arr[i], res = 0;
            
            while(num > 0){
                num = num & (num-1);
                res++;
            }
            map.computeIfAbsent(res, k -> new ArrayList<>()).add(arr[i]);
        }
        
        int k = n-1;
        for(ArrayList<Integer> group: map.values()){
            ArrayList<Integer> list = group;
            
            while(!list.isEmpty()){
                arr[k] = list.remove(list.size()-1);
                k--;
            }
    } 
}
}
