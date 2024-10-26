package ONCAMPUS_DRIVE;

/*

Find the Most Repeating Character in a String

Input:
A string S.

Output:
The character that repeats the most number of times.

Example:

Input: S = "apple"

Output: p

Explanation: The character p occurs 2 times in "apple", which is the highest frequency.

*/

import java.util.*;

public class MostRepeating
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        Map<Character,Integer> map = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int maxCount=Integer.MIN_VALUE;
        char ch='\0';

        for(Map.Entry<Character,Integer> entry : map.entrySet())
        {
               if(entry.getValue()>maxCount)
               {
                   maxCount=entry.getValue();
                   ch=entry.getKey();
               }
        }

        System.out.println(ch);

    }
}
