package Practice;

import java.util.*;

public class Anagram
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s=in.nextLine();
        System.out.print("Enter second string: ");
        String t=in.nextLine();
        s=s.toLowerCase();
        t=t.toLowerCase();
        if(anagram(s,t))
            System.out.println(s + " and " + t + " are anagrams of each other.");
        else
            System.out.println(s + " and " + t + " are not anagrams of each other.");
    }

    public static boolean anagram(String s,String t)
    {
        if(s.length()!=t.length())
            return false;
        int map[] = new int[26];
        Arrays.fill(map,0);
        for(int i=0;i<s.length();i++)
        {
            map[s.charAt(i)-'a']++;
            map[t.charAt(i)-'a']--;
        }

        for(int i=0;i<26;i++)
        {
            if(map[i]==1)
                return false;
        }
        return true;
    }

    public static class ThirdLastConsonant
    {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            char ch = find(s);
            System.out.println(ch);
        }

        private static char find(String s)
        {
            Set<Character> set = new HashSet<>();
            set.add('a');
            set.add('e');
            set.add('i');
            set.add('o');
            set.add('u');

            int count=0;

            for(int i=s.length()-1;i>=0;i--)
            {
                char ch = s.charAt(i);
                if(!set.contains(ch) && count ==2)
                {
                    return ch;
                }
                else if(!set.contains(ch))
                {
                    count++;
                }
            }
            return ' ';
        }

    }

    public static class MaxInteger
    {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.nextLine();
            String words[] = s.split(" ");
            int n =words.length;
            int ans = findMax(words,n);
            System.out.println(ans);

        }

        private static int findMax(String[] s, int n)
        {
            int maxi = -1;
            for(int i=0;i<n;i++)
            {
                try{
                    int a = Integer.parseInt(s[i]);
                    maxi=Math.max(maxi,a);
                }
                catch(Exception e)
                {
                    continue;
                }
            }
            return maxi;
        }

    }
}
