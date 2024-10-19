package Practice;

import java.util.Scanner;

public class ReplaceChars
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s=in.nextLine();
        System.out.println("Modified string is: "+modifiedString(s));
    }
    private static String modifiedString(String s)
    {
        int l=s.length();
        if(l==0)
            return "";
        String modified="";
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            if(ch=='a')
                modified+='b';
            else if(ch=='b')
                modified+='a';
            else
                modified+=ch;
        }
        return modified;
    }
}
