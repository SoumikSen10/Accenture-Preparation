import java.util.Scanner;

public class FindTargetEl
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = in.nextInt();

        System.out.print("The array elements are: ");
        System.out.println(arr.toString());

        int pos = binarySearch(arr,n,target);

        if(pos==-1)
            System.out.println("TARGET NOT FOUND.");
        else
            System.out.println("Target element "+target+" found at position : "+ pos);
    }

    private static int binarySearch(int arr[],int n,int target)
    {
        int left=0,right=n-1;
        while(left<=right)
        {
            int mid = left + (right-left)/2;
            if(arr[mid]==target)
                return mid+1;
            else if(arr[mid]<target)
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}
