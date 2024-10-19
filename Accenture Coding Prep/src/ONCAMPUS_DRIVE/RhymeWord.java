package ONCAMPUS_DRIVE;

/*

You are given an array of strings arr = {"gender", "blender", "blunder", "under"} and an input string thunder. From the array, return the word that rhymes the most with the given word. The rhyme is determined by finding the longest common suffix between the words.

If two words rhyme the most (i.e., they share the same longest common suffix), return the word with fewer characters.

Input:
An integer N representing the number of elements in the array.
An array of strings arr.
A string representing the input word (e.g., thunder).

Output:
The word from the array that rhymes the most with the input word. If multiple words share the same longest suffix, return the shorter word.

Example:

Input:
N = 4
arr = ["gender", "blender", "blunder", "under"]
Input string = "thunder"

Output:
"under"

Explanation: The word "under" shares the longest common suffix with "thunder" ("under"), so it is returned. If multiple words shared the same suffix, the word with fewer characters would be returned.

*/

import java.util.Scanner;

public class RhymeWord
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
            arr[i]=in.next();

        String str = in.next();

        String ans = findRhyme(str,arr,n);
        System.out.println(ans);

    }

    private static String findRhyme(String s,String[] arr,int n)
    {
        String ans="";
        int maxSuffixlen=0;
        for(String word : arr)
        {
           int currentSuffixLen = longestCommonSuffix(s,word);
           if(currentSuffixLen>maxSuffixlen || (currentSuffixLen==maxSuffixlen && word.length()<ans.length()))
           {
               ans=word;
               maxSuffixlen=currentSuffixLen;
           }
        }
        return ans;
    }

    private static int longestCommonSuffix(String a,String b)
    {
        int i=a.length()-1,j=b.length()-1;

        int count=0;
        while(i>=0 && j>=0 && a.charAt(i)==b.charAt(j))
        {
            count++;
            i--;
            j--;
        }
        return count;
    }

}
