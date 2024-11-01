package ONCAMPUS_DRIVE;

/*

You are given two input strings: input1 and input3, along with an integer input2 that represents the size of input1. Write a program that performs the following tasks:

Task:
Write a function countOccurrences that counts how many times the string input3 appears in the string input1.
Input:
Input1: A string input1.
Input2: An integer representing the size of input1.
Input3: A string input3 which we want to count occurrences of.
Output:
The number of occurrences of input3 in input1.
Example:
Input:

Input1: "oxtrtojklts"
Input2: 11
Input3: "t"
Output: 3

Explanation: In the given example, the character "t" appears 3 times in the string "oxtrtojklts". Therefore, the output is 3.

*/

import java.util.Scanner;

public class WordCounting
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        String t = in.next();

//        if(s.length()!=n)
//            System.out.println("Error");
//
//        int count=0,m=t.length();
//
//        // Iterate over the string `s` to find occurrences of substring `t`
//        for(int i = 0; i <= n - m; i++) {
//            if(s.substring(i, i + m).equals(t)) {
//                count++;
//            }
//        }
//
//        System.out.println(count);


        if(s.length()!=n)
            System.out.println("Error");

        int count=0,m=t.length();

        for(int i=0;i<=n-m;i++)
        {
            if(s.substring(i,i+m).equals(t))
                count++;
        }

        System.out.println(count);

    }
}
