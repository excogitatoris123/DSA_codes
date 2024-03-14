import java.util.*;
class Demo
{
    public static void main(String[] args)
    {
        String S="ABCDEABCDEFGHBAAAAAAAAAAAAAAAAAABCDAB";
        String B="";
        HashSet<Character> H=new HashSet<>();

        //Traversing the string array
        for(int i=0;i<S.length();i++)
        {
            if(!H.contains(S.charAt(i)))
            {
                H.add(S.charAt(i));
            }
            else
            {
             
            String A=H.toString();
            if(A.length()>B.length())
            {
                 B=A;
            }
            H.clear();
            }
    
        }
        
        System.out.println("Longest substring is the " +B.toString());
    }
}