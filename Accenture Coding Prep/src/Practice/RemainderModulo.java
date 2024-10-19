package Practice;

import java.util.Scanner;

/*

Given a string of maximum length 1000 representing a large number, output its remainder modulo 11.

*/

public class RemainderModulo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string :");
        String str = in.next();
        System.out.println("Output :"+helper(str));
    }
    private static int helper(String str)
    {
        int rem=0;
        for(int i=0;i<str.length();i++)
        {
            int num=rem*10+(str.charAt(i)-'0');
            rem=rem%11;
        }
        return rem;
    }
}
