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

### Medium

#### Add Two Numbers

* Applied usual addition technique SOP when done manual
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
