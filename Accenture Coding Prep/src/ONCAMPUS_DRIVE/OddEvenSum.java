package ONCAMPUS_DRIVE;

/*

Print the sum of odd numbers & even numbers respectively in a given array.

*/

import java.util.Scanner;

public class OddEvenSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        int oddSum=0,evenSum=0;

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                evenSum+=arr[i];
            else
                oddSum+=arr[i];
        }

        System.out.println(oddSum);
        System.out.println(evenSum);


    }
}
