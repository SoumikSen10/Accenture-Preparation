package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class NextSmallerNumber
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Array is: "+ Arrays.toString(arr));

        System.out.println("Displaying changed array with next smaller numbers: ");

        int i=0,j=1;
        while(i<n && j<n)
        {
            if(arr[i]>arr[j])
            {
                arr[i]=arr[j];
                i++;
                j=i+1;
            }
            else if(arr[i]<arr[j])
            {
                j++;
            }
        }

        while(i<n)
        {
            arr[i]=-1;
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
