package ONCAMPUS_DRIVE;

/*

You are given an integer N and a string S. Your task is to find and return a new string that consists of the original string repeated N times.

Input:
N: an integer representing how many times the string should be repeated.
S: the string that needs to be repeated.

Output:
A string that consists of S repeated N times.

Example:

Input:
N = 3
S = "ABC"

Output:
"ABCABCABC"

*/

import java.util.Scanner;

public class RepeatString
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String str="";
        for(int i=1;i<=n;i++)
        {
            str+=s;
        }
        System.out.println(str);
    }
}
