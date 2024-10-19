package Practice;

import java.util.Scanner;

public class LongestString
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s=in.nextLine();
        String s1=findLongest(s);
        System.out.println(s1);
    }
    public static String findLongest(String s)
    {
        if(s.equals(""))
            return "";
        String[] str = s.split(" ");
        int maxLen=Integer.MIN_VALUE;
        String maxStr="";
        for(String t : str)
        {
            if(t.length()>maxLen) {
                maxLen=t.length();
                maxStr = t;
            }
        }
        return maxStr;
    }
}
