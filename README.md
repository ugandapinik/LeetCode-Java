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


---


**Problem-2:** check if two String are Anagram   
example: "slient" = "listen", "mary" = "army"   
**Solution:**  

> First check the length both word.   
> Compare both word.     

```pesudo
for 1 to length of string
    index = anagram.indexOf(i)
    if index != -1 then
        anagram = anagram.substring(0, index) + anagram.substring(index + 1, string end)
    
```

**Time Complexity: O(n)** 