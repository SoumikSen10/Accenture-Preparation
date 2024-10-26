package ONCAMPUS_DRIVE;

/*

You are given two input strings, and your task is to calculate the number of spaces in each string. Then, return a string indicating whether the absolute difference between the number of spaces in both strings is odd or even, along with the difference itself.

Input:
Input 1: A string representing the first input.
Input 2: A string representing the second input.

Output:
Return a string in the format: Odd:x or Even:x, where x is the absolute difference between the number of spaces in the two strings, and the string describes whether this difference is odd or even.

Example:

Input:
Input 1: "abc bcd cda"
Input 2: "abc bc"

Output:
Odd:1

Approach:
Count the spaces in both strings.
Find the absolute difference between the two space counts.
Check if the difference is odd or even and return the result accordingly.


*/

import java.util.Scanner;

public class SpaceDiff
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();

        int countA = 0 , countB = 0;

        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==' ')
                countA++;
        }

        for(int i=0;i<b.length();i++)
        {
            if(b.charAt(i)==' ')
                countB++;
        }

        int diff = Math.abs(countA-countB);

        if(diff%2==0)
            System.out.println("Even:"+diff);
        else
            System.out.println("Odd:"+diff);

    }
}
