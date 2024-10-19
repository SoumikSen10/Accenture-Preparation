package Practice;//done using two approaches

import java.util.Scanner;

public class PalindromeString
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = in.next();
        if(palCheck2(s))
            System.out.println("It is palindrome.");
        else
            System.out.println("It is not palindrome.");
    }
    private static boolean palCheck(String s)
    {
        int n = s.length();
        for(int i=0;i<n/2;i++)
        {
            if(s.charAt(i)!=s.charAt(n-i-1))
                return false;
        }
        return true;
    }

    private static boolean palCheck2(String s)
    {
        int left=0,right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
