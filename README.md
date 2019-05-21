# Problems
**STRING** releated problems: 

**Problem-1:** maximum occurring character in an input string. 
**Solution:**   

> we will use a technique called ‘Hashing’. 
In this, when we traverse through the string, 
we would hash each character into an array of ASCII characters.   

Typically, ASCII characters are 256, so we use our Hash array size as 256. But if we know that our input string will have characters with value from 0 to 127 only, we can limit Hash array size as 128. Similarly, based on extra info known about input string, the Hash array size can be limited to 26.

**Time Complexity: O(n)**   
**Space Complexity: O(1)** — Because we are using fixed space (Hash array) irrespective of input string size.