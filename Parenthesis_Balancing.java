//Uploading a leetcode problem
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false
 */

class Solution {
    public boolean isValid(String s) {
        //Here need to use stack just insert the open brackets but when hits the close brack pop compare , if okay then done else break error
        try
        {
        Stack<Character> S=new Stack<>();
       if(s.length()<=1)
       {
            return false;
       }
       int flag=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='[')
            {
                S.push(s.charAt(i));
            }
            if(s.charAt(i)=='}')
            {
                char a=S.pop();
                if(a !='{')
                {
                    flag=1;
                    break;
                }

            }
            if(s.charAt(i)==')')
            {
                char b=S.pop();
                if(b !='(')
                {
                    flag=1;
                    break;
                }
            }
            if(s.charAt(i)==']')
            {
                char c=S.pop();
                if(c !='[')
                {
                    flag=1;
                    break;
                }
            }

        }
        
       
        if(flag==1 || S.size()!=0)
        {
            return false;
        }
        else
        {
            return true;
        }
        }
        catch(Exception e)
        {
            return false;
        }
    }
}
