package Practice;/*

Numbers Puzzle

Given a set of numbers, one can arrange them in any order but it pays a penalty equal to the sum of the absolute differences between adjacent numbers.

Return the minimum penalty that must be paid.

Input :

Input 1 : Length of integer array
Input 2 : Integer array

Example 1 :

Input 1 : 3
Input 2 : {1,3,2}

Output : 2

*/

import java.util.Arrays;
import java.util.Scanner;

public class NumbersPuzzle
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int n = in.nextInt();
        int arr[]=new int[n];

        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Array elements are :");
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        int penalty = 0;
        for(int i=0;i<n-1;i++)
        {
            penalty = penalty + Math.abs(arr[i+1]-arr[i]);
        }
        System.out.println("Output : "+penalty);
    }
}
