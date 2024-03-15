import java.util.*;

public class min_max_substrings {
    public static void main (String[] args)
    {
        //First need to create substrings of 3 & store in the arraylist collection then use arrays sort & return the first & last things
    String S="abcdefghijklmnopqrstu";
    //System.out.println(S.length());
    int k=3;
    
    String smallest = "";
    String largest = "";
    ArrayList<String> arr=new ArrayList<String>();
    for(int i=0;i<S.length()-k;i=i+k)
    {
        String A=S.substring(i,i+k);
        arr.add(A);

    }
    String[] brr=arr.toArray(new String[0]); // As collection sort is not working thus.
    Arrays.sort(brr);
    System.out.println(Arrays.toString(brr));
    
    //Also try without using the arrays sort , here use string array
    }
    }



