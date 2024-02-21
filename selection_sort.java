// Selection Sort : Selct one element & compare it others & place it the right position. Here can select anny element
//however if not starrted with particular direction then it will lead us to nothing / will require very much hits. 
//Thus either go from front to last / last to front & apply logic of less than or greater than.
// There was flaw in the understanding of selection sort --> pinned as F1
// Note the array looping mechanism it will be helpful in applying or solving two poiinter coding problems.
import java.util.Arrays;

public class selection_sort {
    public static void main(String args[])
    {
        int[] arr={ 25,85,74,102,69,32,58,47,15,21,};
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) //F1
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
