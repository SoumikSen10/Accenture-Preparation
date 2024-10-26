package ONCAMPUS_DRIVE;

/*

Bob goes to the supermarket to shop for candies represented by an array A for a Halloween party. His mother gave him some money, M. Due to the festive season, there are several offers in the supermarket.

One offer useful for Bob is:

If the price of a candy is a multiple of 5, he can buy it without spending any money.

Otherwise, he will spend money equal to A[i] which is the price of that particular candy.

Bob can shop as long as he has money. Your task is to find and return the maximum number of candies Bob can buy.

Input:
N = Number of candies (size of array A).
A = Array of integers representing the price of each candy.
M = Total amount of money Bob has.

Example:

Example 1:

N=3
A=[5,5,10]
M=16

Output:
Maximum number of candies: 3

Example 2:

N=5
A=[6,4,1,15,5]
M=5

Output:
Maximum number of candies: 4

*/

import java.util.Arrays;
import java.util.Scanner;

public class CandyBuying
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int amount = in.nextInt();

        int maxCandies = calculate(arr,n,amount);
        System.out.println(maxCandies);

    }

    private static int calculate(int[] arr,int n,int amount)
    {
        Arrays.sort(arr);

        int count=0;

        for(int i=0;i<n;i++)
        {
           if(arr[i]%5==0)
               count++;
           else if(arr[i]<=amount)
           {
               amount=amount-arr[i];
               count++;
           }
        }
       return count;
    }

}
