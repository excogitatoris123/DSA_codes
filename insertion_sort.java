//Insertion Sort : Here logically we presume that array is divided in two parts sorted & unsorted.
// Algorithm : Assume first element as sorted -> & remaing array as unsorted --> Then compare the 2nd with first fix its place
//& now sorted elements have 2 elements --> Now after each iteration sorted array will grow & unsorted will get shrinked.
public class insertion_sort {

    public static void shift (int [] arr,int endpoint,int from)
    {
        while(endpoint>from) //If no clear imagination quickly use diagram. 
        {
        arr[endpoint]=arr[endpoint-1];
        --endpoint;
        }

    }

    public static void main(String[] args) {
        int [] arr={22,98,65,74,145,69,320,159,684,74,54,21,36};
        //Take an element from the unsorted array
        //Use reverse loop
        //in reverse loop compare the selected element 
        //a)If anyone found grater than the element
        //1)shift the whole subarray from one here endpoint = index of selected element & from=index of compared element
        //break the reverse loop 
        //iterate the unsorted pointer
        //b)if completes the reverse loop then iterate the unsorted pointer.
        
        shift(arr,endpoint,from);
    }
}