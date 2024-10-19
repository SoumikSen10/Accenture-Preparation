package ONCAMPUS_DRIVE;

/*

Given an array with N elements, you are expected to find the sum of the values that are present in the prime indexes of the array. Note that the array index starts with 0, i.e., the position (index) of the first array element is 0, the position of the next array element is 1, and so on.

Input:
An integer N representing the size of the array.
An array Arr[] of size N.

Output:
Return an integer representing the sum of values that are present at prime indexes in the array.

Example:

Input:
N = 10
Arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100}

Output:
210

Explanation:
Prime indices are 2, 3, 5, and 7 (considering 0-based index).
Values at these positions: 30, 40, 60, 80.
The sum is: 30 + 40 + 60 + 80 = 210.

*/

import java.util.Scanner;

public class PrimeIndex
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int sum=0;

        for(int i=0;i<n;i++)
        {
            if(prime(i))
                sum+=arr[i];
        }
        System.out.println(sum);
    }
    private static boolean prime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
