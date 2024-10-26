package ONCAMPUS_DRIVE;

/*

A young boy finds it difficult to read words that are more than 10 letters long. To help him, you need to write a program that shortens such words.

Task:
For any word longer than 10 letters, the program should convert it into a format where:

The first letter,
The number of letters in between,
And the last letter are kept.
Example:
The word "demonstration" becomes "d11n".

Input:
A sentence as input, containing multiple words. The program needs to process each word separately and apply the above rule.

Output:
A modified sentence according to the rules described.

*/

import java.util.Scanner;

public class ShortenWord
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String words[] = s.split(" ");

        String ans="";

        for(String word : words)
        {
            if(word.length()>10)
                ans = ans + convert(word) + " ";
            else
                ans = ans + word + " ";
        }

        System.out.println(ans.trim());

    }

    private static String convert(String s)
    {
        int n = s.length();
        String x = s.substring(1,n-1);
        //System.out.println(x);
        String ans = "";
        ans  = ans + s.charAt(0) + x.length() + s.charAt(n-1);

        return ans;
    }

}
