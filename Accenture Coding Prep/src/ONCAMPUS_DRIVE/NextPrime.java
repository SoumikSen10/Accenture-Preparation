package ONCAMPUS_DRIVE;

/*

Find Next Prime

You are given two numbers A and B such that A is a prime number. Your task is to check whether B is the next prime number immediately after A.

Example:
Input: A = 7, B = 13
Output: False
Explanation: The next prime number after 7 is 11, not 13.

Input: A = 7, B = 11
Output: True
Explanation: The next prime number after 7 is 11.



*/

import java.util.Scanner;

public class NextPrime
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int nextPrime = a+1;

        while(true)
        {
            if(prime(nextPrime))
             break;
            nextPrime++;
        }

        if(nextPrime==b)
            System.out.println("True");
        else
            System.out.println("False");

    }

    private static boolean prime(int n)
    {
        if(n<2)
            return false;

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
