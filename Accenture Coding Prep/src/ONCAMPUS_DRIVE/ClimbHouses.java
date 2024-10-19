package ONCAMPUS_DRIVE;

/*

 Count the Number of Houses Alice Can Climb
Alice has a pair of magical shoes that allows her to climb 3 stairs at once. In the city, there are N houses, and the roof of each house is represented by an integer in an array A. Alice can reach the roof of only those houses where the number is a multiple of 3.

Your task is to find and return an integer value representing the count of houses whose roof Alice can climb.

Input:
N: The number of houses.
A[]: An array of size N representing the roof heights of the houses.

Output:
An integer representing the count of houses Alice can climb.

Examples:
Input:
N = 4
A[] = {12, 16, 21, 203}

Output:
2

Input:
N = 1
A[] = {6}

Output:
1

*/

import java.util.Scanner;

public class ClimbHouses
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int count=climb(arr,n);
        System.out.println(count);
    }

    private static int climb(int[] arr,int n)
    {
        int count=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%3==0)
                count++;
        }
        return count;
    }
}
