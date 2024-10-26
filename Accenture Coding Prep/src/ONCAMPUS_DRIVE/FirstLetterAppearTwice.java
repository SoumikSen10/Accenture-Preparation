package ONCAMPUS_DRIVE;

/*

Find the first letter to appear twice in the given string.

Example :

Input : s="abccbaacz"
Output : 'c'

*/

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstLetterAppearTwice
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch = find(s);
        if(ch=='\0')
            System.out.println("Not found");
        else
            System.out.println(ch);
    }

    private static char find(String s)
    {

        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(set.contains(ch))
                return ch;
            else
                set.add(ch);
        }
        return '\0';
    }
}
