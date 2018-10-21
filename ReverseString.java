// Java program to ReverseString using StringBuilder 
/*
1. String class in Java does not have reverse() method,
however StringBuilder class has built in reverse() method.
2. StringBuilder class do not have toCharArray() method, 
while String class does have toCharArray() method.
 */

import java.lang.*; 
import java.io.*; 
import java.util.*; 
  
public class ReverseString {
    
// Class of ReverseString 
 
    public static void main(String[] args) 
    { 
        String input = "Geeks for Geeks"; 
  
        StringBuilder input1 = new StringBuilder(); 
  
        // append a string into StringBuilder input1 
        input1.append(input); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1); 
    } 
} 

