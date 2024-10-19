package ONCAMPUS_DRIVE;

/*

Charles is given an array A. He wants to find the count of occurrences of the second largest element in the array. Your task is to help him find and return an integer value representing the count of occurrences of the second largest element in the array.

Note:
If the array contains the same element throughout, then return 0.
The array has only consecutive elements, i.e., it is sorted in non-decreasing order.

Input:
An integer N, representing the size of the array.
An array A[] of size N, representing the elements.

Output:
Return an integer representing the count of occurrences of the second largest element in the array.

Example:

Input 1:
N = 5
A[] = [1, 2, 3, 3, 4]

Output 1:
2

Input 2:
N = 4
A[] = [2, 2, 2, 2]

Output 2:
0

*/

import java.util.Scanner;

public class CountOccurence
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int largest = arr[n-1], secondlargest = 0;
        int count=0;

        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]!=largest)
            {
                secondlargest=arr[i];
                break;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(arr[i]==secondlargest)
                count++;
        }

        System.out.println(count);

    }
}
