class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int ox = x;
        int y = 0;
        while (x != 0) {
            int digit = x%10;
            y = (y*10) + digit;
            x/=10;
        }    
        return ox == y;
    }
}