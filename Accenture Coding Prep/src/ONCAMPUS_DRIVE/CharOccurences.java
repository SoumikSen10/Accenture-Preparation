package ONCAMPUS_DRIVE;

/*

Find the character c occurences in a given string.

Input:

str="shaurya"
c='a'

Output:

2

*/


import java.util.Scanner;

public class CharOccurences
{
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);

        String str=in.next();
        char ch=in.next().charAt(0);

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==ch)
                count++;
        }

        System.out.println(count);

    }
}
