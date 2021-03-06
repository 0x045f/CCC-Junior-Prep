# Welcome to Lesson #7!
> today we will be another short lesson, with just some build-in functions and simple search algorithms
> ## Substrings
>> substrings are basically a string within the main string, so a substring of ```abcabc``` could be ```ca```   
>> note that substrings can be empty and can be a single letter, so a valid substing of ```abcaba``` could be either ``` ```, or ```a```   
>> now lets get into some build-in functions
>> ## Python
>>> python's ``` in ``` function for strings basically checks if one string is in another,     
>>> or simply, if string ```a``` is a substring of string ```b```  
>>> the speed is about **O(L1 * L2)** time, where L1 & L2 are the lengths of the strings is the size of the string   
>>> A much faster algorithm is the [KMP](https://en.wikipedia.org/wiki/Knuth%E2%80%93Morris%E2%80%93Pratt_algorithm), but don't worry about
that for now, as I'm pretty sure its not going to appear in the CCC junior

>> ## Java
>>> java's ``` contains() ``` function basically does the same thing as the python code above,   
>>> it checks if string ```a``` contains string ```b```   
>>> it has the same time complexity as python **O(L1 * L2)**

>> ## C++
>>> c++'s ``` find() ``` function is the same thing as python's and java's   
>>> it also has the same time complexity **O(L1 * L2)**

> ## Checking for one element
>> When searching for one element, we can implement a simple search to find the element   
>> Pseudo code: 
>> ```
>> for i... size of string:
>>    if string[i] == key:
>>      print found at i
>>      break
>> ```
>> This runs in **O(N)** time, where N is the size of the string, the implementation is left as an exercise to the reader

> ## Characters
>> Strings are made up of characters, so your language have built-in functions to retrieve each character    
>> Python
>> ``` 
>> string[i]
>> ```
>> Java
>> ``` 
>> string.charAt(i);
>> ```
>> C++
>> ``` 
>> string[i];
>> ```
>> This will retrieve the character at index ```i``` and this runs in **O(N)** time

> ## Comparing
>> when comparing elements, your language will have specific functions to compare them
>> Python   
>> ```==```   
>> Java   
>> ```equals()``` for strings or ```==``` for characters   
>> C++    
>> ```==```   
>> Comparisons are usually **O(1)** time   

> ## Adding Strings
>> concatenating strings together, this is used in variety of ways, the implementations are left to the reader as an exercise
>> addition are usually **O(1)** time as well

> ## Final Note
>> Thats about it! Any other stuff is up to you to search up, either documentations or algorithms, the rest is left to you   
>> Read up on documentation or algorithms if unsure of how they work




