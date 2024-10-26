package ONCAMPUS_DRIVE;

/*

You are given an array of size N, and you have to return the pair of elements whose sum is equal to a given target and whose product is the maximum.

Note:

The first value of the pair must be greater than the second value.

Input:
A target value.
An integer N representing the size of the array.
An array of integers of size N.

Output:
Return the pair of elements whose sum is equal to the target and whose product is the maximum.

Example:

Input:
Target = 18
N = 8
Array = [11, 1, 2, 8, 10, 11, 15, 7]

Output:
[10, 8]

Explanation:

The pairs whose sum is equal to the target 18 are: [11, 7], [10, 8].
Out of these pairs, the pair with the maximum product is [10, 8], with a product of 80. Thus, the output is [10, 8].

*/

import java.util.Arrays;
import java.util.Scanner;

public class TargetSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int target=in.nextInt();

        Arrays.sort(arr);

        // Reverse the array to get descending order
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        int res[] = findPair(arr,n,target);
        System.out.println(Arrays.toString(res));

    }

    private static int[] findPair(int[] arr,int n,int target)
    {
        int res[]=new int[2];
        Arrays.fill(res,0);

        int start=0,end=n-1;
        int maxProd=0;
        while(start<end)
        {
            int sum = arr[start]+arr[end];

            if(sum==target)
            {
                int product = arr[start]*arr[end];
                if(product>maxProd)
                {
                    maxProd = product;
                    res[0] = arr[start];
                    res[1] = arr[end];
                }
                start++;
                end--;
            }
            else if(sum<target)
                end--;
            else if(sum>target)
                start++;
        }
        return res;
    }

}
