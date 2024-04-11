class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length(); i++) {
            int indexOfChar = sb.indexOf(""+s.charAt(i));
            if(indexOfChar != -1) {
                if(sb.toString().length() > longest) {
                    longest = sb.toString().length();
                }
                sb.delete(0, indexOfChar+1);
            }
            sb.append(s.charAt(i));
        }
        return Math.max(sb.toString().length(),longest);
    }
}