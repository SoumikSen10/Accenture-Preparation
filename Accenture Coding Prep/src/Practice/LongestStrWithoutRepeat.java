package Practice;

/*

Problem Statement:
------------------
Given a string `s`, find the length of the longest substring without repeating characters.

Example 1:
----------
Input: "abcabcbb"
Output: 3
Explanation: The longest substring without repeating characters is "abc", which has a length of 3.

Example 2:
----------
Input: "bbbbb"
Output: 1
Explanation: The longest substring without repeating characters is "b", which has a length of 1.

Example 3:
----------
Input: "pwwkew"
Output: 3
Explanation: The longest substring without repeating characters is "wke", which has a length of 3.
Note that "pwke" is not a valid answer, as the substring must be continuous.

Approach:
---------
We use the sliding window technique along with a hash array to keep track of the frequency of characters.
The goal is to find the longest substring where no character appears more than once.

Algorithm:
----------
1. Initialize two pointers `left` and `right` at the beginning of the string, and a hash array to track characters.
2. Increment the frequency of the current character at `right` in the hash array.
3. If the frequency becomes greater than 1, it indicates that the character is repeated.
   In this case, we move the `left` pointer to the right until the character is no longer repeated.
4. Calculate the length of the current substring (`right - left + 1`) and update `maxLength` accordingly.
5. Return the `maxLength` at the end of the loop.

*/

import java.util.Scanner;

public class LongestStrWithoutRepeat
{
    // Method to find the length of the longest substring without repeating characters
    public int lengthOfLongestSubstring(String s)
    {
        // Create a hash array to keep track of character frequencies
        int[] hashArray = new int[128]; // Supports all ASCII characters
        int left = 0, right = 0, maxLength = 0;

        // Sliding window approach
        while (right < s.length())
        {
            // Get the current character at the right pointer
            char ch = s.charAt(right);
            // Increment the count of the character in the hash array
            hashArray[ch]++;

            // Check if the character count exceeds 1, indicating a duplicate
            while (hashArray[ch] > 1) {
                // Move the left pointer to the right and decrease the count of the character at the left pointer
                hashArray[s.charAt(left)]--;
                left++;
            }

            // Calculate the length of the current substring and update the maximum length
            maxLength = Math.max(maxLength, right - left + 1);

            // Move the right pointer to the next character
            right++;
        }

        return maxLength;
    }

    // Main method for testing the solution
    public static void main(String[] args)
    {
        // Create an instance of the class
        LongestStrWithoutRepeat obj = new LongestStrWithoutRepeat();
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find and print the length of the longest substring without repeating characters
        int result = obj.lengthOfLongestSubstring(inputString);
        System.out.println("Length of the longest substring without repeating characters: " + result);

        scanner.close();
    }
}
