package ONCAMPUS_DRIVE;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*

Input: A string S.
Task: Delete all the vowel occurrences in that string which occur only between the consonants and return the modified string.
Example:

Input: "applesarefallingfromtheskies"
Output: "applsrfllngfrmthskies"

*/
public class DelVowelOccur
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ans = generate(s);
        System.out.println(ans);
    }

    private static String generate(String s)
    {
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        String ans="";

        int n = s.length();

        if (n == 0) return s;

        ans+=s.charAt(0);

        for(int i=1;i<n-1;i++)
        {
            char ch=s.charAt(i);
            char prev=s.charAt(i-1);
            char next=s.charAt(i+1);
            if(set.contains(ch) && !set.contains(prev) && !set.contains(next))
                continue;
            else
                ans+=s.charAt(i);
        }
        if (n > 1) {
            ans+=(s.charAt(n - 1)); // ensuring that the last character of the string is always included in the result.
        }

        return ans;
    }

}
