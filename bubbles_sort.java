//Basically each time i encounter this topic , it get partial imagination of all this three things , 
//each is wuietly same , thus it leads confusion , topics are not hard they are easy but , 
//lacks clarity between three of them & need a well structured approach to remember them.
// Advice -> Dont compare the bubble & selection sort , look them as independent entity simply go by the defination it will be helpful in the avoiding confusion.
//Avoid or realise the flawed imagination
//Bubble Sort : 

import java.util.Arrays;

public class bubbles_sort {

    public static void main(String args[])
    {

    
    int arr[]={ 54,87,14,32,69,45,84,25,1,7,18,74,9,67,};
    System.out.println(Arrays.toString(arr));    


    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr.length-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }
    }

    System.out.println(Arrays.toString(arr));    
}
}