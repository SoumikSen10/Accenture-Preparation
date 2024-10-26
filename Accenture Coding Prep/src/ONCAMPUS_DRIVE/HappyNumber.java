package ONCAMPUS_DRIVE;

/*

Write an algorithm to determine if a number n is happy.

A happy number is defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.

Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1.

Those numbers for which this process ends in 1 are happy numbers.

Return true if n is a happy number, and false if not.

Example:

Input: n = 19
Output: true

*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HappyNumber
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(practice(n))
            System.out.println("Happy Number");
        else
            System.out.println("Not a happy number");
    }


    private static boolean practice(int n)
    {
        Set<Integer> seenNumbers = new HashSet<>();

        while(n!=1 && !seenNumbers.contains(n))
        {
            seenNumbers.add(n);
            n=sumsSquare(n);
        }

        return n==1;

    }

    private static int sumsSquare(int n)
    {
        int newNum = 0;
        while(n>0)
        {
            int digit = n%10;
            newNum = newNum + digit*digit;
            n=n/10;
        }
        return newNum;
    }


//    public static boolean isHappy(int n)
//    {
//        if(n==1)
//            return true;
//
//        if(seenNumbers.contains(n))
//            return false;
//
//        seenNumbers.add(n);
//
//        int newNum=0;
//
//        while(n>0)
//        {
//            int digit=n%10;
//            newNum+=digit*digit;
//            n=n/10;
//        }
//
//       return isHappy(newNum);
//
//    }

}
