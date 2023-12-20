
class Solution { 
    int minSubset(int[] a,int N) { 
          Arrays.sort(a);
        long ans=0;
        for(int i=0;i<N;i++) ans+=a[i];
        
        int c=0; long dum=0;
        for(int j=N-1;j>0;j--) {ans-=a[j];
        dum=dum+a[j];
        c++;
            if(dum>ans) return c; 
        }
        return 1;
        
    }
}