// Binary Search : Searching using partisan logic. However could be done on the array data structure that also sorted array.
// Doubt : can it be done through recursive logic?? -> Quite confused so approaching with whatever logic i have.

//declare the array
import java.util.Scanner;
class Binary_Search{
public static void main(String args[])
{
int [] arr={10,20,30,40,55,66,77,88,99,108};

int start=0; int end=arr.length-1;

int mid;
System.out.println("Enter no to be searched");
Scanner sc=new Scanner(System.in);
int search=sc.nextInt();
int flag=0;
while(end>=start)
{
mid=(start+end)/2;
if(arr[mid]==search)
{
    System.out.println("No is found at the position :"+mid);
    flag=1;
    break;
}
else if(arr[mid]<search)
{
    start=mid+1;
}

else if(arr[mid]>search)
{
    end=mid-1;
}

}
if (flag==0)
{
    System.out.println("Sorry no is not available");
}
}
}
//take sorted inputs  or assign it
// take a start pointer & end pointer & assign them 0 & array.length-1 

// mid point expression
//compare the search value with mid index element
//a) If greater then assign start=mid+1 b)if less the assign end equal to mid-1 c)if found return present with index no.
// again iterate the loop , goingback to mid point condition
//till end point is less than staring point then return value is absent
