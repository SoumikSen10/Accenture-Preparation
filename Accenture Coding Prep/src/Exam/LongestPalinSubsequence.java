package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LongestPalinSubsequence
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scanner.next();

        // Generate and print all palindromic subsequences
        List<String> palindromicSubsequences = findAllPalindromicSubsequences(word);
        System.out.println("All Palindromic Subsequences: " + palindromicSubsequences);
    }

    private static List<String> practice(String str)
    {
        List<String> subsequences = new ArrayList<>();
        int n = str.length();

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String subsequence = "";
                for(int k=i;k<=j;k++)
                {
                    subsequence+=str.charAt(k);
                }

                if(isPalindrome(subsequence))
                    subsequences.add(subsequence);

            }
        }
        return subsequences;
    }

    // Method to find all palindromic subsequences of a given word
    public static List<String> findAllPalindromicSubsequences(String word) {
        List<String> palindromicSubsequences = new ArrayList<>();
        int n = word.length();

        // Iterate over all possible subsequences using nested for-loops
        for (int i = 0; i < n; i++) { // Starting index of subsequence
            for (int j = i; j < n; j++) { // Ending index of subsequence
                String subsequence = "";

                // Collect characters to form a subsequence
                for (int k = i; k <= j; k++) {
                    subsequence += word.charAt(k);
                }

                // Check if the formed subsequence is palindromic
                if (isPalindrome(subsequence)) {
                    palindromicSubsequences.add(subsequence);
                }
            }
        }

        return palindromicSubsequences;
    }

    // Method to check if a given string is a palindrome
    private static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
