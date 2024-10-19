package Practice;

import java.util.Arrays;
import java.util.Scanner;

/*

Given an integer array, move all zeroes to end of the array, keeping the relative order of non-zero elements same.

Input : arr[] = {1,2,0,0,0,3,6}
Output : 1 2 3 6 0 0 0

Input : arr[] = {0,1,9,8,4,0,0,2,7,0,6,0,9}
Output : 1 9 8 4 2 7 6 9 0 0 0 0 0

*/
public class MoveZeroestoEnd
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int n =in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements :");
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        System.out.println("Original array is :");
        System.out.println(Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("Changed array is :");
        System.out.println(Arrays.toString(arr));

    }

    public static void moveZeroes(int[] nums)
    {
        if(nums.length<=1)
            return;
        int j=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                j=i;
                break;
            }
        }

        /// no non zero numbers
        if(j==-1)
            return;

        for(int i=j+1;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}
