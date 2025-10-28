class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=0;i<n;i++){
            double ans = Math.pow(2,i);
            if(ans==(double)n){
                return true;
            }
        }
        return false;
        
    }
}
