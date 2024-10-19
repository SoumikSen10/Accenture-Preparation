package ONCAMPUS_DRIVE;

/*

Jack has an array A of length N. He wants to label whether the number in the array is even or odd. Your task is to help him find and return a string with labels even or odd in sequence according to which the numbers appear in the array.

*/

import java.util.Scanner;

public class JackArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=in.nextInt();
        }

        String ans = "";

        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
                ans+="even";
            else
                ans+="odd";
        }
        System.out.println(ans);
    }
}
