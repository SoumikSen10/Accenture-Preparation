package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Question: Write a program to check if a given number is a "Happy Number".
// A happy number is defined by the following process: Starting with any positive integer,
// replace the number by the sum of the squares of its digits, and repeat the process
// until the number equals 1 (where it will stay), or it loops endlessly in a cycle
// that does not include 1. Those numbers for which this process ends in 1 are happy numbers.

// Sample Test Case:
// Input: 19
// Explanation:
// 1^2 + 9^2 = 1 + 81 = 82
// 8^2 + 2^2 = 64 + 4 = 68
// 6^2 + 8^2 = 36 + 64 = 100
// 1^2 + 0^2 + 0^2 = 1 => Happy number
// Output: Happy number

public class HappyNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if (check(n))
            System.out.println("Happy number");
        else
            System.out.println("Not a happy number");
    }

    // Method to check if a number is happy
    private static boolean check(int n) {
        Set<Integer> set = new HashSet<>();
        set.add(n);

        // Continue the process until n becomes 1 or a cycle is detected
        while (n != 1) {
            n = squareSum(n);

            // If we find the same number again, it's a cycle (not a happy number)
            if (set.contains(n))
                return false;

            set.add(n);
        }
        return true; // If n reaches 1, it's a happy number
    }

    // Method to calculate the sum of the squares of the digits of a number
    private static int squareSum(int n) {
        int s = 0;
        while (n != 0) {
            int d = n % 10;
            s = s + d * d;
            n = n / 10;
        }
        return s;
    }
}
