//Merge sort : Sorting the whole array using the partisan approach & then regrouping them. 
//Refered apna college vedio. Use 8 step method to deal with any problem.
//Paucity of time , till the exam , try to inculcate. Along with the time complexity.
// Time complexity though at the time does not  matter to us however in the long run its a vimp thing so have a habit of keeping note of it , dont just ignore it altogether.
class MergeSort
{

    public static void conquer (int arr[],int si , int mid,int ei)
    {
        int merged []=new int [ei-si+1];
        int indx1=si;
        int indx2=mid+1;
        int x=0;

        while(indx1<=mid && indx2<=ei)
        {
            if(arr[indx1]<=arr[indx2])
            {
                merged[x++]=arr[indx1++];
            }
            else
            
            {
                merged[x++]=arr[indx2++];
            }
        }

        while(indx1<=mid)
        {
            merged[x++]=arr[indx1++];
        }

        while(indx2<=ei)
        {
            merged[x++]=arr[indx2++];
        }

        for(int i=0 , j=si;i<merged.length;i++,j++)
        {
            arr[j]=merged[i];
        }
    }



    

    public static void divide(int arr[],int si, int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int mid=si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }    

    public static void main(String args[]) 
    {
        int arr[]= {14,16,18,69,20,14,606,745,201,305};
        int n=arr.length;

        divide(arr,0,n-1);

        //print
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println(" ");
    }


}