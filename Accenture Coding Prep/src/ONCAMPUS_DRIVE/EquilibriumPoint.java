package ONCAMPUS_DRIVE;

/*

 Find the Equilibrium Point in an Array

The function accepts an integer array arr[] of size n as its argument. The function needs to return the index of an equilibrium point in the array, where the sum of elements on the left of the index is equal to the sum of elements on the right of the index.

If no equilibrium point exists, return -1.

Input:
n: The number of elements in the array.
arr[]: An array of size n representing the elements.

Output:
An integer representing the index of the equilibrium point, or -1 if no such point exists.

Example:

Input:
n = 7
arr[] = {-7, 1, 5, 2, -4, 3, 0}

Output:
3

Explanation: The equilibrium point is at index 3, where the sum of elements on both sides of this index is equal.

*/

import java.util.Scanner;

public class EquilibriumPoint
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int point=findEquilibrium(arr,n);
        System.out.println(point);
    }

    private static int findEquilibrium(int[] arr,int n)
    {
        // use concept of prefixSum and suffixSum
        // at whichever index prefixSum and suffixSum value is equal, that point is the equilibrium point .

//        int prefixSum[] = new int[n];
//        int suffixSum[] = new int[n];
//
//        prefixSum[0]=arr[0];
//        for(int i=1;i<n;i++)
//        {
//            prefixSum[i] = arr[i]+prefixSum[i-1];
//        }
//
//        suffixSum[n-1]=arr[n-1];
//        for(int i=n-2;i>=0;i--)
//        {
//            suffixSum[i]=arr[i]+suffixSum[i+1];
//        }
//
//        for(int i=0;i<n;i++)
//        {
//            if(prefixSum[i]==suffixSum[i])
//                return i;
//        }
//        return -1;

        //optimized approach
        //concept of calculating the total sum of the array and then using a left sum to check if the equilibrium point exists.
        int totalSum=0;
        for(int i=0;i<n;i++)
        {
            totalSum+=arr[i];
        }

        int leftSum=0;
        for(int i=0;i<n;i++)
        {
            totalSum-=arr[i];
            if(leftSum == totalSum)
                return i;
            leftSum+=arr[i];
        }
        return -1;
    }
}

/*

Explanation:

Calculate Total Sum:
First, calculate the total sum of all elements in the array.

Iterate through the Array:
As you iterate through each index, subtract the current element from the total sum. This gives you the sum of elements to the right of the current index.

Simultaneously, keep track of the left sum. If at any point the left sum equals the right sum, that index is the equilibrium point.

Update Left Sum:
After checking the equilibrium condition for the current index, update the left sum by adding the current element.

*/