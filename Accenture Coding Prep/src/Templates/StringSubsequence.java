package Templates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*

Count and Return All Subsequences of a String

Problem Description: Given a string as input, find all possible subsequences of the string. A subsequence is defined as a sequence derived from the given string by deleting zero or more characters without changing the order of the remaining characters.

Example:

Input:
str = "abc"

Output:
["", "a", "b", "ab", "c", "ac", "bc", "abc"]

*/

public class StringSubsequence {

    // Main method to find and return all subsequences of a given string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.next();

        // Call the method to find all subsequences
        List<String> subsequences = findAllSubsequences(input, 0, "");

        // Print the subsequences
        System.out.println("All Subsequences of \"" + input + "\": " + subsequences);
    }

    // Single method to find all subsequences of a given string using pick - not pick logic
    public static List<String> findAllSubsequences(String str, int index, String current) {
        // Create a result list to hold the subsequences
        List<String> result = new ArrayList<>();

        // Base case: when the index reaches the length of the string
        if (index == str.length()) {
            result.add(current); // Add the current subsequence to the result list
            return result;
        }

        // Pick the current character and gather the results
        result.addAll(findAllSubsequences(str, index + 1, current + str.charAt(index)));

        // Not pick the current character and gather the results
        result.addAll(findAllSubsequences(str, index + 1, current));

        // Return the combined result list
        return result;
    }
}
