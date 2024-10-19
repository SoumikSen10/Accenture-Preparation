package ONCAMPUS_DRIVE;

/*

Find the First K Words of a String
You are given a string str and an integer K. Your task is to return the first K words of the string.

Input:
str: A string consisting of multiple words.
K: An integer representing the number of words to return.

Output:
A string containing the first K words from str.

Example:

Input:
str = "MY NAME IS SHAURYA AWASTHI"
K = 3

Output:
"MY NAME IS"

*/

import java.util.Scanner;

public class KWords
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int k = in.nextInt();
        String ans = find(str,k);
        System.out.println(ans);
    }
    public static String find(String s,int k)
    {
//       String words[]=s.split(" ");
//       String ans="";
//       if(k>words.length || k==0)
//           return "";
//       int i=0;
//       for(i=0;i<k-1;i++)
//       {
//           ans+=words[i] + " ";
//       }
//       ans+=words[i];

        //optimized code without using extra space
        String ans="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' )
                count++;

            if(count==k)
                break;
            ans+=s.charAt(i);
        }

       return ans;
    }
}
