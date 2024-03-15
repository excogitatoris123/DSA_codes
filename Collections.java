//Basically doing the collections clarity of sysntax
/* 1) Stack 2)Queue 3) Linked List 4) HashMap 5) Iterator 6) Hashset
 * 
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Collections {
    
    public static void main(String args[])
    {
        Stack<Integer> A=new Stack<>();
        A.push(7);
        A.pop();
        A.peek();
        A.add(0, null);
        A.clear();
        A.isEmpty();
       // System.out.println(say);
    
         Queue<String> Ab=new LinkedList<>();
         Ab.add(null);
         Ab.peek();
         Ab.remove();
         Ab.poll();//return & removes
         Ab.clear();
         Ab.isEmpty(); 

         ArrayList<Integer> jg=new ArrayList<>();
        jg.add(null);
        jg.add(0, null);   
        jg.get(0);
        jg.set(0, null);
        jg.size();
        jg.remove(0);
        jg.isEmpty();
        jg.clear();  

    //     LinkedList<Integer> first=new LinkedList<>();
        
        HashMap<Integer,Integer> Abcd=new HashMap<>();
         Abcd.put(null, null);
         Abcd.   
    //     int[] a={8,6,7,4,5,9,25,14};
    //    // Arrays.sort(a);
    //     int[] b={8,6,7,4,5,9,25,14};

    //     boolean f=Arrays.equals(a,b);
    //     System.out.println(f);
    //     //Iterable<Integer> abc=
    
    }


}
