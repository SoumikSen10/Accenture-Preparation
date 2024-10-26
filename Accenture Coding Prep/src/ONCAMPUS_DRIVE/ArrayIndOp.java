package ONCAMPUS_DRIVE;

/*

You are given an array of integers. Your task is to perform two operations:

Calculate the sum of the values at even indices in the array.
Calculate the XOR of the values at odd indices in the array.
Finally, return the sum of the results from the above two operations.

Input Format:

The first line contains an integer N, the number of elements in the array.
The second line contains N integers separated by spaces, representing the elements of the array.

Output Format:

Print a single integer, which is the sum of:
The sum of the values at even indices.
The XOR of the values at odd indices.


Example:

Input:
5
1 2 3 2 1

Output:
6

Explanation:

Sum of even indices (0, 2, 4): 1 + 3 + 1 = 5
XOR of odd indices (1, 3): 2 ^ 2 = 0
The final result is: 5 + 0 = 6.

*/

import java.util.Scanner;

public class ArrayIndOp
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int sumEven=0,xorOdd=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sumEven+=arr[i];
            }
            else
            {
                xorOdd^=arr[i];
            }
        }

        System.out.println(sumEven+xorOdd);


    }
}
