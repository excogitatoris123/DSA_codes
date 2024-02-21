//Conept of pivot & partition is imporatnat these are two importatn keywords
//In choosing the pivot also we have four 4 ways : 1) Random 2)median of all numbers 3) 1st element 4) Last element
//Could not grasp the whole thing , do it again & again & inculcate it.
public class quick_sort {
    
    public static void quicksort(int arr[],int low , int high)
    {
        if(low<high)
        {
            int pindx=partition(arr, low,high);
            quicksort(arr,low,pindx-1);
            quicksort(arr,pindx+1,high);
        }

    }

    
    public static int partition(int [] arr,int low , int high)
    {
        int pivot=arr[high];
        int i=low-1;
        
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                //swap
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        //swap with pivot
        i++;
        int temp=arr[i];
        arr[i]=arr[high];
        arr[high]=temp;
        return i ;
    



    }

    public static void main(String args[])
    {
        int arr[] = { 85,96,84,715,234,65,024,94,81};
        int n=arr.length;
        quicksort(arr,0,n-1);

        //print
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }

        System.out.println(" ");
    }

}
