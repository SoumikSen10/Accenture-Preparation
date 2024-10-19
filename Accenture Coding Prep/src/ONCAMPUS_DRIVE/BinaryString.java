package ONCAMPUS_DRIVE;

/*

The binary number system only uses two digits, 0 and 1. A number system that uses binary digits can be called a binary string. You are required to implement the following function:

int OperationsBinaryString(string str);
The function accepts a string str as its argument.

The string str consists of binary digits separated with an alphabet as follows:

A denotes AND operation.
B denotes OR operation.
C denotes XOR operation.

You are required to calculate the result of the string str, scanning the string from left to right, taking one operation at a time, and return the final result.

Note:
No order of priorities of operations is required.
Length of str is odd.
If str is NULL or None (in the case of Python), return -1.

Example:

Input:
str = "1C0C1C1A0B1"

Output:
1

*/

import java.util.Scanner;

public class BinaryString
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      String str = in.next();
      int n = OperationsBinaryString(str);
        System.out.println(n);
    }

    private static int OperationsBinaryString(String str)
    {
        if(str==null || str.length()==0)
            return -1;

        int num=str.charAt(0)-'0';
        for(int i=1;i<str.length()-1;i+=2)
        {
            if(str.charAt(i)=='A')
                num = num & str.charAt(i+1)-'0';
            else if(str.charAt(i)=='B')
                num = num | str.charAt(i+1)-'0';
            else if(str.charAt(i)=='C')
                num = num ^ str.charAt(i+1)-'0';
        }
        return num;
    }
}
