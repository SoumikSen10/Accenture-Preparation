package Practice;/*

Input : a3b3c2
n=5

Output:b

Logic : a3b3c2 = aaabbbcc
5th position = b

*/

import java.util.Scanner;

public class WordFormation
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        String s1 = practice(s);
        System.out.println(s1);
        if(s1.length()>n)
            System.out.println(s1.charAt(n-1));
        else
            System.out.println("-1");
    }

    private static String generate(String s)
    {

        String s1="";

        for(int i=0;i<s.length()-1;i+=2)
        {
            int c = (int)(s.charAt(i+1)-'0');
            while(c!=0)
            {
                s1+=s.charAt(i);
                c--;
            }
        }

        return s1;
    }

    private static String practice(String s)
    {
        String s1="";

        for(int i=0;i<s.length();i+=2)
        {
            int num = (int)(s.charAt(i+1)-'0');
            while(num!=0)
            {
                s1+=s.charAt(i);
                num--;
            }
        }

        return s1;

    }

}
