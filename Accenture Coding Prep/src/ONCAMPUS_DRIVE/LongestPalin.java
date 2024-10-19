package ONCAMPUS_DRIVE;

/*

You are given a string, and you need to find the longest palindromic substring in it.

Example 1:
Input:
"babad"

Output:
"aba"

Example 2:
Input:
"cbxbd"

Output:
"bxb"

*/

import java.util.Scanner;

public class LongestPalin
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(longestPalin(s));
    }

    private static String longestPalin(String s)
    {
        int n = s.length();
        if (n == 0) {
            return "";  // Handle empty string case
        }
        int st=0;
        int maxLen=1;
        // odd
        for(int i=0;i<n;i++)
        {
           int l=i,r=i;
           while(l>=0 && r<n)
           {
               if(s.charAt(l)==s.charAt(r))
               {
                   l--;
                   r++;
               }
               else
                   break;
           }
           int len=r - l - 1;
           if(maxLen<len)
           {
               maxLen=len;
               st=l+1;
           }
        }

        //even
        for(int i=0;i<n-1;i++)
        {
            int l=i,r=i+1;
            while(l>=0 && r<n)
            {
                if(s.charAt(l)==s.charAt(r))
                {
                    l--;
                    r++;
                }
                else
                    break;
            }
            int len=r - l - 1;
            if(maxLen<len)
            {
                maxLen=len;
                st=l+1;
            }
        }

        return s.substring(st,st+maxLen);
    }

}

/*

We want to find the longest palindromic substring** in a given string.


1. A palindrome reads the same forward and backward.
2. A palindrome can have:
   - Odd length**: like "aba", where the center is a single character.
   - Even length: like "abba", where the center is between two characters.

### Expand Around Center Approach:
For every character (and for every pair of consecutive characters), we expand outward to check if it forms a palindrome. This ensures we check both odd-length and even-length palindromes.

### Why Two Loops?
1. Odd-length palindrome check:
   - We treat each character as the center and expand outward. Example: "aba" has `b` as the center, and we expand left and right to check if the characters match.

   ```
   for (int i = 0; i < n; i++) {
       int l = i, r = i;  // l and r start at the same index for odd-length
       // Expand outward while the characters are the same
   }
   ```

2. Even-length palindrome check:
   - We treat every pair of consecutive characters as the center and expand outward. Example: "abba" has the center between the two middle `b`s, and we expand left and right.

   ```
   for (int i = 0; i < n - 1; i++) {
       int l = i, r = i + 1;  // l and r start at consecutive characters for even-length
       // Expand outward while the characters are the same
   }
   ```

### How `st` (Start Index) and `maxLen` Work:
1. `maxLen` keeps track of the maximum length of the palindrome found so far.
2. `st` stores the starting index of the longest palindrome.

#### For Each Center:
- We expand outward while the characters at `l` (left pointer) and `r` (right pointer) are the same.
- After expanding, we calculate the length of the palindrome using `r - l - 1` (because `l` and `r` overshoot by 1 in the final iteration).

  ```
  int len = r - l - 1;  // Length of palindrome after expanding
  ```

- If the current palindrome length (`len`) is greater than the current maximum length (`maxLen`), we update `maxLen` and the start index `st` of the palindrome.

  ```
  if (maxLen < len) {
      maxLen = len;  // Update the max palindrome length
      st = l + 1;    // Update the start index (adjust for overshoot)
  }
  ```

### Why Two Loops?
- First loop: Handles odd-length palindromes by expanding around a single character (like "aba").
- Second loop: Handles even-length palindromes by expanding around consecutive characters (like "abba").

### Final Step:
After both loops, `st` holds the starting index and maxLen holds the length of the longest palindrome. We return the substring from st to st + maxLen.

```
return s.substring(st, st + maxLen);
```

### Summary:
- Odd-length palindromes: Use a single character as the center and expand outward.
- Even-length palindromes: Use two consecutive characters as the center and expand outward.
- `st`: Keeps track of where the longest palindrome starts.
- `maxLen`: Keeps track of the length of the longest palindrome found.


*/