package Practice;/*

Ques 1:

Given a string you are requested to determine whether it should be converted to all uppercase or all lowercase, depending on the count of uppercase and lowercase letters in the string.

Example 1:
AbCdEfG

Output 1:
ABCDEFG

*/

import java.util.Scanner;

public class CaseConvert
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = in.next();
        String ans = caseConvert(str);
        System.out.println("Output is :"+ans);
    }

    private static String caseConvert(String str)
    {
        int up=0,low=0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z')
                up++;
            else if(ch>='a' && ch<='z')
                low++;
        }
        if(up>=low)
            str=str.toUpperCase();
        else
            str=str.toLowerCase();
        return str;
    }
}
