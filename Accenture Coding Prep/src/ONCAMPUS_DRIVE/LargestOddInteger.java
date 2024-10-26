package ONCAMPUS_DRIVE;

/*

Given a string S, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string S.

Note: A substring is a contiguous sequence of characters within a string. A null string ("") is also a substring.

Example 1:
Input:
S = "504"
Output:
5
Explanation: Among the substrings of S, 5 is the largest odd-valued integer.
Example 2:
Input:
S = "30752"
Output:
3075
Explanation: Among the substrings of S, 3075 is the largest odd-valued integer.
Constraints:
The input string S represents a large integer with digits only (no special characters).
A substring must be contiguous within S.

* */

import java.util.Scanner;

public class LargestOddInteger
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        String ans = find(s);
        System.out.println(ans);

    }

    private static String find(String s)
    {
        if((s.charAt(s.length()-1)-'0')%2 == 1)
            return s;

        int i=s.length()-1;

        while(i>=0)
        {
            int n = s.charAt(i)-'0';
            if(n%2==1)
            {
                return s.substring(0,i+1);
            }
            i--;
        }
        return "";

    }



}
