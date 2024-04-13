/**
 * My initial solution post the Monotonic stack discovery
 * Runtime: 260 ms (5th percentile)
 * Memory: 46.02 MB (11th percentile)
 */
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        int ok = k;
        Stack<Character> stack = new Stack<>();
        if(len == k) return "0";
        for (char digit : num.toCharArray()) {
            while(k>0 && !stack.empty() && stack.peek() >digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        String res = "";
        while(!stack.empty()) {
            res = stack.pop() + res;
        }
        int j = 0;
        while(res.charAt(j)=='0' && j<len-ok-1){
            j++;
        }
        return res.substring(j, len-ok);
    }
}

/**
 * My initial solution post the Monotonic stack discovery
 * Runtime: 85 ms (10th percentile)
 * Memory: 45.90 MB (20th percentile)
 */
class Solution {
    public String removeKdigits(String num, int k) {
        int len = num.length();
        int ok = k;
        Stack<Character> stack = new Stack<>();
        if(len == k) return "0";
        for (char digit : num.toCharArray()) {
            while(k>0 && !stack.empty() && stack.peek() >digit) {
                stack.pop();
                k--;
            }
            stack.push(digit);
        }

        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }

        String res = "";
        while(!stack.empty()) {
            res = stack.pop() + res;
        }
        int j = 0;
        while(res.charAt(j)=='0' && j<len-ok-1){
            j++;
        }
        return res.substring(j, res.length());
    }
}

/** The performance result look shady as there is not much optimization/change 
 * between the 2 programs that could result in such big savings */