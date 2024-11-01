package ONCAMPUS_DRIVE;

/*

Given two binary strings a and b, return their sum as a binary string.

Example:

Input:
a = "1010"
b = "1011"
Output: "10101"

Explanation:
The binary addition of 1010 and 1011 is performed as shown:
  1 0 1 0
+ 1 0 1 1
---------
1 0 1 0 1

In the given example:
The sum of 1010 and 1011 results in 10101.


*/

import java.util.Scanner;

public class BinarySum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        String ans = practice(a,b);
        System.out.println(ans);

    }

    private static String addBinary(String a,String b)
    {
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();

        while(i >= 0 || j >= 0 || carry != 0)
        {
            if(i >= 0)
            {
                carry += a.charAt(i) - '0';
                i--;
            }

            if(j >= 0)
            {
                carry += b.charAt(j) - '0';
                j--;
            }

            // Add the current digit to the result
            ans.append(carry % 2);
            carry = carry / 2;
        }

        // Reverse the result as we're adding digits from the end
        return ans.reverse().toString();
    }

    private static String practice(String a ,String b)
    {
        int i=a.length()-1,j=b.length()-1,carry=0;

        StringBuilder ans = new StringBuilder();

        while(i>=0 || j>=0 || carry!=0)
        {
            if(i>=0)
            {
                carry = carry + a.charAt(i)-'0';
                i--;
            }

            if(j>=0)
            {
                carry = carry + b.charAt(j)-'0';
                j--;
            }

            ans.append(carry%2);
            carry=carry/2;

        }
        return ans.reverse().toString();
    }

}
