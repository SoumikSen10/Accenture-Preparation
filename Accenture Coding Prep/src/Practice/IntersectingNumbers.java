package Practice;

/*

You are given two integers, start and end, which represent the range [start, end] (inclusive). For each number in this range, generate a set of its divisors and find the intersection of these sets for all the numbers between the start and end values. After finding the intersection, perform the following steps:

Count the total number of common divisors.
Determine if the number of common divisors is odd or even.
Return the number of common divisors and whether they are odd or even.

Input:
An integer start (lower bound of the range).
An integer end (upper bound of the range).

Output:
An integer representing the total number of common divisors.
A string indicating whether the number is "Odd" or "Even".

Example:

Input:
start = 22
end = 27

Output:
3 Odd

*/

import java.util.Scanner;

public class IntersectingNumbers
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int result = countOddDivisorNumbers(start, end);
        System.out.println(result);
    }

    private static int countOddDivisorNumbers(int start, int end) {
        int oddDivisorCount = 0;

        // Loop over each number from start to end
        for (int n = start; n <= end; n++) {
            int divisorCount = 0;

            // Find divisors of n
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    divisorCount++; // i is a divisor
                }
            }

            // Check if the number of divisors is odd
            if (divisorCount % 2 != 0) {
                oddDivisorCount++;
            }
        }

        return oddDivisorCount;
    }
}
