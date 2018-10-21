/*

// Optimized Java Program to find the fist character   
// that is repeated 
  
import java.util.*; 
import java.lang.*; 
  
public class GFG 
{ 
    public static int findRepeatFirst(String s) 
    { 
        // this is optimized method 
        int p = -1, i, k; 
  
        // initialized counts of occurrences of 
        // elements as zero 
        int MAX_CHAR = 256; 
        int hash[] = new int[MAX_CHAR]; 
  
        // initialized positions 
        int pos[] = new int[MAX_CHAR]; 
  
        for (i = 0; i < s.length(); i++) 
        { 
            k = (int)s.charAt(i); 
            if (hash[k] == 0) 
            { 
                hash[k]++; 
                pos[k] = i; 
            } 
            else if (hash[k] == 1) 
                hash[k]++; 
        } 
  
        for (i = 0; i < MAX_CHAR; i++) 
        { 
            if (hash[i] == 2) 
            { 
                if (p == -1) // base case 
                    p = pos[i]; 
                else if (p > pos[i]) 
                    p = pos[i]; 
            } 
        } 
  
        return p; 
    } 
  
// Driver code 
    public static void main(String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int pos = findRepeatFirst(str); 
        if (pos == -1) 
            System.out.println("Not found"); 
        else
            System.out.println(str.charAt(pos)); 
    } 
} 
 */

/*Simple Solution using O(N^2) complexity
The solution is to loop through the string for each character and 
search for the same in the rest of the string.
This would need two loops and thus not optimal.
*/

import java.io.*; 
import java.util.*; 

public class StringFirstRepeat {
    
// Java program to find the fist character 
// that is repeated 

  
    static int findRepeatFirstN2(String s) 
    { 
          
        // this is O(N^2) method 
        int p = -1, i, j; 
        for (i = 0; i < s.length(); i++) 
        { 
            for (j = i + 1; j < s.length(); j++) 
            { 
                if (s.charAt(i) == s.charAt(j)) 
                { 
                    p = i; 
                    break; 
                } 
            } 
            if (p != -1) 
                break; 
        } 
      
        return p; 
    } 
      
    // Driver code 
    static public void main (String[] args) 
    { 
        String str = "geeksforgeeks"; 
        int pos = findRepeatFirstN2(str); 
          
        if (pos == -1) 
            System.out.println("Not found"); 
        else
        System.out.println( str.charAt(pos)); 
    } 

}
