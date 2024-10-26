package ONCAMPUS_DRIVE;

/*

You are given a string in the input which consists of words separated by full stops (.). Your task is to return the word with the largest size.

Example:

Input:
"hello.my.name.is.shaurya"

Output:
"shaurya"

Explanation:

The input string contains words separated by full stops. Among these words, "shaurya" is the longest word, so it is returned.


*/

import java.util.Scanner;

public class StringStop
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        int len=0,maxLen=Integer.MIN_VALUE;

        String longestWord = "";
        String currentWord="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='.')
            {
                if(currentWord.length()>longestWord.length())
                {
                    longestWord=currentWord;
                }
                currentWord="";
            }
            else
            {
                currentWord+=ch;
            }
        }

        if(currentWord.length()>longestWord.length())
        {
            longestWord=currentWord;
        }

        System.out.println(longestWord);

    }
}
