/*
Explanation: Recursive function (reverse) takes string pointer (str) as input and 
calls itself with next location to passed pointer (str+1). 
Recursion continues this way, when pointer reaches \0, 
all functions accumulated in stack print char at passed location (str) and return one by one.

Time Complexity: O(n)
 */
public class StringReverse {
 
    /* Function to print reverse of the passed string */
    void reverse(String str) 
    { 
        if ((str==null)||(str.length() <= 1)) 
           System.out.println(str); 
        else
        { 
            System.out.print(str.charAt(str.length()-1)); 
            reverse(str.substring(0,str.length()-1)); 
        } 
    } 
      
    /* Driver program to test above function */
    public static void main(String[] args)  
    { 
        String str = "Geeks for Geeks"; 
        StringReverse obj = new StringReverse(); 
        obj.reverse(str); 
    }     

}
