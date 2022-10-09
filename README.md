# Leetcode-Solutions
Solutions of Leetcode problems using JAVA
----------------------------------------------------------------------------------------------

Using LeetCode for Cracking Coding Interviews Effectively - https://www.youtube.com/watch?v=q15JgVVLXQg
TIPS : https://anthonydmays.com/blog/2022/05/09/how-to-practice-leetcode-problems-the-right-way/

## 5 Mistakes:
1. The details aren't always there (ask questions in an Interview)
2. Working Code ISN'T everything (improve your efficiency)
3. Your code isn't evaluated, YOU ARE! (think out loud)
4. Focusing on things that don't matter (don't worry about comparative statistics on Leetcode)
5. Not practicing in the right setting (practice without autocomplete/syntax highlighting using a whiteboard/pen-paper)
**Aspects like how you communicate, listen and respond to things matter as much as your coding skills**

## STEPS:
1. Spend max 30 , 45, 1 hr acc to easy medium hard
2. Proper pseudocode and Time complexity in notebook
3. code first in notepad
4. comments in code , notes in notion
5. Compare solution from gfg and improve that time
6. Time complexity how do of built in?? How implement built in? use it?(MARK QU AS BUILT IN)
7. Rev ??

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

