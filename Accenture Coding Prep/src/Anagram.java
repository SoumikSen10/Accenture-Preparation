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
}
