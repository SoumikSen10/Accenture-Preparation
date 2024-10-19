package ONCAMPUS_DRIVE;

/*

You are provided with a string that consists of a sequence of 1s and 0s. This sequence is the encoded version of an English word. Your task is to write a program to decode the provided string and find the original word. Each uppercase alphabet is represented by a sequence of 1s.

Each letter is encoded as follows:

A → 1
B → 11
C → 111
...
Z → 111... (26 times)
Also, two alphabets are separated by a '0'.

Example:

Input:
101110111

Output:
ABC (The decoded word is "ABC" where A → 1, B → 11, C → 111)

*/

import java.util.Scanner;

public class StringDecoder
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = decode(s);
        System.out.println(ans);
    }

    private static String decode(String s)
    {
        String ans="";
        int count=0,n=s.length();

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='1')
                count++;
            else
            {
                ans+=(char)('A'+(count-1));
                count=0;
            }
        }
        ans+=(char)('A'+(count-1));

        return ans;
    }
}
