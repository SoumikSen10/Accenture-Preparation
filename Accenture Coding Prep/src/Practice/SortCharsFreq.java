package Practice;

/*

Sort Characters by Frequency
Given a string s, return the string sorted by the frequency of characters in descending order. If there are multiple characters with the same frequency, their order in the output does not matter.

Constraints:
The frequency of each character should determine its order in the output.
Characters with higher frequencies should appear before characters with lower frequencies.
If two characters have the same frequency, their order can be arbitrary.

Input:
A string s consisting of lowercase and uppercase English letters and possibly digits.

Output:
A string sorted by the frequency of characters in descending order.

Example 1:
Input:
s = "tree"

Output:
"eert" or "eetr"

Explanation:
The character 'e' appears twice, and the characters 't' and 'r' each appear once. Thus, 'e' appears first in the result, followed by 't' and 'r' in any order.

Example 2:
Input:
s = "cccaaa"

Output:
"cccaaa" or "aaaccc"

Explanation:
Both 'c' and 'a' appear three times, so their order does not matter.

*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharsFreq
{
    public String frequencySort(String s)
    {
        // Step 1: Count frequency of each character using a HashMap
        HashMap<Character, Integer> map = new HashMap<>();
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Create a list of characters from the map's key set
        List<Character> characters = new ArrayList<>(map.keySet());

        // Step 3: Sort the list based on frequency in descending order
        characters.sort((a, b) -> map.get(b) - map.get(a));

        // Step 4: Build the resulting string using StringBuilder
        StringBuilder sb = new StringBuilder();

        for (char c : characters)
        {
            int freq = map.get(c);
            // Append the character 'freq' number of times to the StringBuilder
            for (int i = 0; i < freq; i++)
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args)
    {
        SortCharsFreq sorter = new SortCharsFreq();
        String input = "tree";
        String result = sorter.frequencySort(input);
        System.out.println("Sorted by frequency: " + result);
    }
}
