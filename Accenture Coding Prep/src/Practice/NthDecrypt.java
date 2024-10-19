package Practice;

import java.util.Scanner;

/*

Nth character in Decrypted String

Every character in the input string is followed by its frequency.

Write a function to decrypt the string and find the nth character of the decrypted string.
If no character exists at that position then return "-1".

For example**: if the input string is "a2b3", the decrypted string will be "aabbb".

Note: The frequency of the encrypted string can not be greater than a single digit, i.e. < 10.

Example 1:

Input 1: a2b2c2d1
Input 2: 5

Output: c

*/
public class NthDecrypt
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string :");
        String str = in.next();
        System.out.println("Enter position :");
        int pos = in.nextInt();

        String ch = decrypt(str,pos);
        System.out.println("Output is :"+ch);

    }
    private static String decrypt(String str,int pos)
    {
        int sum=0;
        String ans="";

        for(int i=1;i<str.length();i+=2)
        {
            sum+=str.charAt(i)-'0';
            if(sum>=pos)
            {
                ans+=str.charAt(i-1);
                return ans;
            }
        }
        return "-1";

    }
}
