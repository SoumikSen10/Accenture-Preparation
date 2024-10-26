package ONCAMPUS_DRIVE;

/*

You are given a string S, and your task is to find and return the count of permutations that can be formed by fixing the positions of the vowels present in the string.

Note:
Ensure the result is non-negative.
If there are no consonants in the string, return 0.

Example:
For the string:
S = "ybghiahebuyitob"

You have:
Vowels: a, e, u, i, o
Total number of positions to fill: 10
The formula to calculate permutations is based on the number of consonants and vowels.

*/

import java.util.*;

public class WordPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        // Define vowels to check against
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        // Map to store the frequency of consonants
        Map<Character, Integer> consonantMap = new HashMap<>();
        int consonantCount = 0;

        // Counting consonants and ignoring vowels
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!vowels.contains(ch) && Character.isLetter(ch)) { // Consonant check
                consonantMap.put(ch, consonantMap.getOrDefault(ch, 0) + 1);
                consonantCount++;
            }
        }

        // If no consonants, return 0
        if (consonantCount == 0) {
            System.out.println(0);
            return;
        }

        // Calculate the factorial of the total number of consonants
        long ans = fact(consonantCount);

        // Divide by the factorial of the frequencies of repeated consonants
        for (Map.Entry<Character, Integer> el : consonantMap.entrySet()) {
            ans = ans / fact(el.getValue());
        }

        System.out.println(ans);
    }

    // Helper method to calculate factorial
    private static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }
}

