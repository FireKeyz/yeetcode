# yeetcode 🧑‍💻

Solutions to leetcode problems and learnings

## References

> Leetcode editorial screenshots - <https://github.com/akhilkammila/leetcode-screenshotter>

## Learnings

### Easy

#### Number of Students Unable to Eat Lunch

* Use stack for cases where you need to keep popping out top elements if you don't want to traverse
* Use queue for cases where you need to keep moving elements to the back if unprocessed
* Explore constant use-case - either `O(n)` or `O(1)` post coming up with brute force solution

#### Two Sum

* When you want to speed up searching for the index of an element in an array, use a Map to store KV pairs of `value : index`.
  * This will give you near `O(1)` runtime and in case of hash collisions `O(n)` which is rare.
* Try to optimize some problems by making using of initial loop where you populate your data structure to also execute business logic

#### Fair Candy Swap

* Post tackling `O(mxn)` or `O(n^2)`, always try to solve in `O(n)` - Basically lower complexities
* While trying to find a suitable match in another array for an element in the given array - try converting Array to Set/Map to speed up look-up time.
* Compute final/expected result for each array/element if possible and intelligently use Diff based approaches i.e, what it takes to get to the result.

#### Palindrome Number

* Try to have initial checks and return in case of edge cases, 0, negative numbers etc.
* If you are going to modify input, ensure it's backed up in case needed later

#### Sqrt(x)

* Handle edge scenarios like 0 & 1
* When you need to explore a huge set of numbers, especially ordered, prefer binary search over linear

### Medium

#### Add Two Numbers

* Apply usual addition technique SOP when done manual when dealing with addition with data structures
* Special care needs to be given to carryovers as corner-scenario
* Try to optimize NULL checks and don't have too many IF checks

#### Longest Substring Without Repeating Characters

* When it comes to String problems - always check for -
  * NULL
  * Empty strings
  * Whitespace characters
  * What happens when a branching condition is never hit i.e., input is the answer
* While keeping track of characters, see if a character array will come in handy to count -
  * `int[26]` - for the english alphabet
  * `int[128]` - ASCII
  * `int[256]` - Extended ASCII
* **Sliding Window** - Keeping track of a particular segment of the data array and keep moving the bounds and processing

#### Remove K Digits

* Came across the concept of Monotonic stack refers to a stack with elements that in either increasing or decreasing order - [GFG Link](https://www.geeksforgeeks.org/introduction-to-monotonic-stack-data-structure-and-algorithm-tutorials/)
* Use the Java inbuilt [Stack](https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html) class for easy use with standard operations
* For adjacent element comparison - always apply `Stack` and verify if it works
* Be aware of the limitation of Integer/Long before converting a super-long String into numeric equivalent
* **Strip leading zeroes** - Either parse to Integer & back, use Regex, Apache Utils or just check element and remove/reduce

#### Container with Most Water

* Amazing problem. A key takeaway being when exploring `m*n` possibilities, when you take a given `m` and realize after one/some value of `n`, it doesn't make sense to continue processing with other `n` values as we will never get to the end/better result, just drop the `m` and move to the next `m`
