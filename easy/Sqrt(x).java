class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        int l = 1;
        int r = x/2;
        while(l<=r) {
            int mid = l+(r-l)/2;
            long sq = (long)mid*mid;
            if(sq < x) {
                l = mid+1;
            } else if(sq > x){
                r = mid-1;
            } else {
                return mid;
            }
        }
        return r;
    }
}