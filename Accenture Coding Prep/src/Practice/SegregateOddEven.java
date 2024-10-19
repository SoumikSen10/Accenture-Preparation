package Practice;/*

Segregate Even and Odd Number:

Given an array A[], write a function that segregates even and odd numbers. The function should put all even numbers first, and then odd numbers.

Note: Order of elements does not matter.

Input:
- {12, 34, 45, 9, 8, 90, 3}

Output:
- {12, 34, 8, 90, 45, 9, 3}

Input:
- {12, 10, 9, 45, 2, 10, 45}

Output:
- {12, 10, 2, 10, 9, 45, 45}

*/

import java.util.Arrays;
import java.util.Scanner;

public class SegregateOddEven
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = in.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("After changes :");
        int l=0,r=arr.length-1;
        while(l<r)
        {
            if(arr[l]%2==1)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
            }
            else
                l++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
