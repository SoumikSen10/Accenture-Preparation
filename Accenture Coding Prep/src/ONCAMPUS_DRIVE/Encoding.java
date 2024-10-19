package ONCAMPUS_DRIVE;

/*

You are given a string Input1 that has been encoded using a pattern. The task is to decode the string and return the original text.

Encoding Pattern:
Each letter in the encoded string is shifted by a fixed number of positions forward in the alphabet. Your task is to determine the decoded string by reversing this shift and returning the original message.

Example:

Input:
Input1: nrfzh

Output:
quick

Input:
Input1: phqgh

Output:
sktjk

Constraints:
Assume that all characters in the input are lowercase English letters (a-z).
The same shift is applied to each letter

*/

import java.util.Scanner;

public class Encoding
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();

        String converted = encode(str);
        System.out.println(converted);
    }

    private static String encode(String str)
    {
        String converted="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);

            ch=(char)(((ch-'a'+3)%26)+'a');

            converted+=ch;
        }
        return converted;
    }
}
