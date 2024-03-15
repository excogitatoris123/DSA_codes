//Insertion Sort : Here logically we presume that array is divided in two parts sorted & unsorted.
// Algorithm : Assume first element as sorted -> & remaing array as unsorted --> Then compare the 2nd with first fix its place
//& now sorted elements have 2 elements --> Now after each iteration sorted array will grow & unsorted will get shrinked.
// public class insertion_sort {

//     public static void shift (int [] arr,int endpoint,int from)
//     {
//         while(endpoint>from) //If no clear imagination quickly use diagram. 
//         {
//         arr[endpoint]=arr[endpoint-1];
//         --endpoint;
//         }

//     }

//     public static void main(String[] args) {
//         int [] arr={22,98,65,74,145,69,320,159,684,74,54,21,36};
//         //Take an element from the unsorted array
//         //Use reverse loop
//         //in reverse loop compare the selected element 
//         //a)If anyone found grater than the element
//         //1)shift the whole subarray from one here endpoint = index of selected element & from=index of compared element
//         //break the reverse loop 
//         //iterate the unsorted pointer
//         //b)if completes the reverse loop then iterate the unsorted pointer.
        
//         shift(arr,endpoint,from);
//     }
// }

//Dry run & understand the logic. Second is the deduce a approach for shifting logic. make a function for it if seems okayy.
//One more input is that -> instead on soving multiple problems , find solution for common pattern or hacks which takes time.
// Another one is use function approach it will benefit in the sense that each time you are solving multiple things then after diving the problem you will already 
//have the solution or the answer for multiple things , & you can dedicate time on the just extra needed things.

import java.util.Arrays;

public class insertion_sort {
    public static void main(String args[])
    {
        int[] arr={89,54,2,1,67,489,325,147};       
    
        //insertion sort
        for(int i=0;i<arr.length;i++)
        {
            int current =arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;

            }

            //placement
            arr[j+1]=current;

           
        }
        System.out.print(Arrays.toString(arr));
    
    }
}