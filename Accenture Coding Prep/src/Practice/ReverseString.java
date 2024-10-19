package Practice;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args)
    {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = in.nextLine();
        System.out.print("Reverse of string is : "+reverse(s));
    }

    private static String reverse(String s)
    {
        String[] words = s.split(" ");
        String str="";
        for(int i=words.length-1;i>=0;i--)
        {
            str+=words[i]+ " ";
        }
        return str;
    }
}
