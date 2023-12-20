class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        int i=0;
        int j=0;
        long c=0;
        Arrays.sort(a1);
        Arrays.sort(a2);
        while(i<n && j<m){
            if(a1[i]==a2[j]){
                c++;
                i++;
                j++;
            }
            else if(a1[i]>a2[j]){
                return "No";
                
            }
            else{
                i++;
            }
        }
        if(c==m){
            return "Yes";
        }
        else{
            return "No";
        }
    }
}
