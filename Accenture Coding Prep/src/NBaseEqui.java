/*

N-base notation is a system for writing numbers that uses only n different symbols. These symbols are the first n symbols from the given notation list(including the symbol for o) Decimal to n base station are (0:0,1:1,2:2,3:3,4:4,5:5,6:6,7:7,8:8,9:9,10:A,11:B and so on upto 35:Z).

Implement the following function.

char DectoNBase(int n,int num)

The function accepts positive integer n and num. Implement the function to calculate the n-base equivalent of num and return the same as a string.

Steps:

a)Divide the decimal number by n. Treat the division as the integer division

b)Write the remainder (in n-base notation)

c)Divide the quotient again by n. Treat the division as integer division.

d)Repeat step 2 and 3 until the quotient is 0.

e) The n-base value is the sequence of the remainders from last to first.

Assumption: 1<n<=36

Example 1
Input : n=12 num=718
Output : 4BA

Example 2
Input : n=21 num=5678
Output : CI8

*/

import java.util.Scanner;

public class NBaseEqui
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=in.nextInt();
        System.out.print("Enter the base n: ");
        int n=in.nextInt();
        char[] res=DectoNBase(n,num);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]);

    }

    private static char[] DectoNBase(int n,int num)
    {
        if (num == 0)
            return new char[]{0};
        // Handle the edge case for num=0

        String ans="";

        while(num>0)
        {
            int d = num%n;
            if(d<=9)
                ans=d+ans;
            else if(d>=10 && d<=35)
            {
                ans=(char)((d-10)+65)+ans;
            }
            num=num/n;
        }
        return ans.toCharArray();
    }
}
