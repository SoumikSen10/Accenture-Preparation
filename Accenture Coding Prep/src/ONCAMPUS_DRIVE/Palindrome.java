package ONCAMPUS_DRIVE;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        if(check(s))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    public static boolean check(String s)
    {

        char str[]=s.toCharArray();

        int n=str.length;
        if(n<=1)
            return true;

        for(int i=0;i<n/2;i++)
        {
            if(str[i]!=str[n-i-1])
                return false;
        }
        return true;
    }
}
