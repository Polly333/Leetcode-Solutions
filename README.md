# Leetcode-Solutions
Solutions of Leetcode problems using JAVA
----------------------------------------------------------------------------------------------

Using LeetCode for Cracking Coding Interviews Effectively - https://www.youtube.com/watch?v=q15JgVVLXQg

## 5 Mistakes:
1. The details aren't always there (ask questions in an Interview)
2. Working Code ISN'T everything (improve your efficiency)
3. Your code isn't evaluated, YOU ARE! (think out loud)
4. Focusing on things that don't matter (don't worry about comparative statistics on Leetcode)
5. Not practicing in the right setting (practice without autocomplete/syntax highlighting using a whiteboard/pen-paper)
**Aspects like how you communicate, listen and respond to things matter as much as your coding skills**

----------------------------------------------------------------------------------------------------
## Approach to Solving Questions
### Thoughts Before Coding
* Finding different approaches for the problem
    * Brute force approach
    * Optimization to the brute force approach
* Finding the right data structure
    * We need to map a value to another value? HashMap!
    * We need to keep track of a count of different elements? HashMap!
    * We need to have quick lookup for individual elements? HashSet!
    * We need to model a network of people? Graph!
    * Matching Brackets? Stack!
* Any algorithms that can be used
    * Finding cycles? 2 POINTER APPROACH
    * Searching in sorted array? BINARY SEARCH
    * Finding shortest path between 2 nodes in a graph? BREATH FIRST SEARCH
    * Need a way to produce a path between 2 nodes? HASHMAP TO KEEP TRACK OF PREVIOUS ELEMENTS
    * Need to prevent overlapping recursive calls? MEMOIZATION
    * Save memory from our recursive stack? BOTTOM UP APPROACH
    * 2 Sorted Arrays? 2 POINTER APPROACH
* Optimizing time and space complexity
    * Can we use a different data structure to improve our runtime?
    * Should we use a different algorithm to improve our runtime?
* How do we approach dynamic programming problems?
    * First find the brute force recursive approach
    * Then look for overlapping recursive calls, 
        * Provide the top down memoization solution
    * Lastly, flip the solution around and find the bottom up approach
* Trade-offs between time and space?
    * Should we use HashMap/HashSet for quicker lookup?
    * Can we save previously seen values in a data structure?
    * Instead of using data structure, can we use a single value to represent the information we need?
    * Can we find an iterative approach instead of a recursive approach?
* Side Cases to Consider
   * What if our input is null?
   * What if our input is empty?
   * Are there negative values?
   * Will our additions overflow?
   * Off by one errors?
   * Is the value inside the boundary of allowed values?

### Answer
- Write our a semi-pseudocode explaining our solution to the problem
    - Validate our input   
    - What algorithm are we using?
    - What data structure will we be instantiating?
    - Any side cases to consider when implementing the code
        - Look out for off-by 1 errors
        - What are the terminating conditions of loops
    - For recursive implementations
        - What are the parameters?
        - What are the base cases?
        - What do we do in each of the recursive call?
        
### Time and Space Complexity
- Average case?
- Worst case?    

Taken from - https://github.com/david2999999/Leet-Code-Youtube
____________________________________________________________



### Leetcode Must Do Problems
| No. | Questions |
| --- | --------- |
|1  | [Two Sum](https://leetcode.com/problems/two-sum) |
|2  | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters) |
|3  | [Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring) |
|4  | [Container With Most Water](https://leetcode.com/problems/container-with-most-water) |
|5  | [3Sum](https://leetcode.com/problems/3sum) |
|6  | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list) |
|7  | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses) |
|8  | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists) |
|9  | [Merge k Sorted Lists](https://leetcode.com/problems/merge-k-sorted-lists) |
|10  | [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array) |
|11  | [Combination Sum](https://leetcode.com/problems/combination-sum) |
|12  | [Rotate Image](https://leetcode.com/problems/rotate-image) |
|13  | [Group Anagrams](https://leetcode.com/problems/group-anagrams) |
|14  | [Maximum Subarray](https://leetcode.com/problems/maximum-subarray) |
|15  | [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) |
|16  | [Jump Game](https://leetcode.com/problems/jump-game) |
|17  | [Merge Intervals](https://leetcode.com/problems/merge-intervals) |
|18  | [Insert Interval](https://leetcode.com/problems/insert-interval) |
|19  | [Unique Paths](https://leetcode.com/problems/unique-paths) |
|20  | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs) |
|21  | [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes) |
|22  | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring) |
|23  | [Word Search](https://leetcode.com/problems/word-search) |
|24  | [Decode Ways](https://leetcode.com/problems/decode-ways) |
|25  | [Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree) |
|26  | [Same Tree](https://leetcode.com/problems/same-tree) |
|27  | [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal) |
|28  | [Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree) |
|29  | [Construct Binary Tree from Preorder and Inorder Traversal](https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal) |
|30  | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock) |
|31  | [Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum) |
|32  | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome) |
|33  | [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence) |
|34  | [Clone Graph](https://leetcode.com/problems/clone-graph) |
|35  | [Word Break](https://leetcode.com/problems/word-break) |
|36  | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle) |
|37  | [Reorder List](https://leetcode.com/problems/reorder-list) |
|38  | [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray) |
|39  | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array) |
|40  | [Reverse Bits](https://leetcode.com/problems/reverse-bits) |
|41  | [Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits) |
|42  | [House Robber](https://leetcode.com/problems/house-robber) |
|43  | [Number of Islands](https://leetcode.com/problems/number-of-islands) |
|44  | [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list) |
|45  | [Course Schedule](https://leetcode.com/problems/course-schedule) |
|46  | [Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree) |
|47  | [Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure) |
|48  | [Word Search II](https://leetcode.com/problems/word-search-ii) |
|49  | [House Robber II](https://leetcode.com/problems/house-robber-ii) |
|50  | [Contains Duplicate](https://leetcode.com/problems/contains-duplicate) |
|51  | [Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree) |
|52  | [Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst) |
|53  | [Lowest Common Ancestor of a Binary Search Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree) |
|54  | [Lowest Common Ancestor of a Binary Tree](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree) |
|55  | [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self) |
|56  | [Valid Anagram](https://leetcode.com/problems/valid-anagram) |
|57  | [Meeting Rooms](https://leetcode.com/problems/meeting-rooms) |
|58  | [Meeting Rooms II](https://leetcode.com/problems/meeting-rooms-ii) |
|59  | [Graph Valid Tree](https://leetcode.com/problems/graph-valid-tree) |
|60  | [Missing Number](https://leetcode.com/problems/missing-number) |
|61  | [Alien Dictionary](https://leetcode.com/problems/alien-dictionary) |
|62  | [Encode and Decode Strings](https://leetcode.com/problems/encode-and-decode-strings) |
|63  | [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream) |
|64  | [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence) |
|65  | [Coin Change](https://leetcode.com/problems/coin-change) |
|66  | [Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph) |
|67  | [Counting Bits](https://leetcode.com/problems/counting-bits) |
|68  | [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements) |
|69  | [Sum of Two Integers](https://leetcode.com/problems/sum-of-two-integers) |
|70  | [Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow) |
|71  | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement) |
|72  | [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals) |
|73  | [Serialize and Deserialize BST](https://leetcode.com/problems/serialize-and-deserialize-bst) |
|74  | [Subtree of Another Tree](https://leetcode.com/problems/subtree-of-another-tree) |
|75  | [Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings) |
|76  | [Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence) |
|77  | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) |

List taken from - https://github.com/ombharatiya/FAANG-Coding-Interview-Questions 
