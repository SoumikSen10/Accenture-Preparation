package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();
        System.out.println("No of permutations :"+fact(str));
        List<String> ans = new ArrayList<>();
        permutations(str,ans,"");
        for(String el : ans)
        {
            System.out.print(el+" ");
        }
    }

    private static int fact(String str)
    {
        int n=str.length();
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }


    private static void permutations(String str,List<String> ans,String prefix)
    {
        if(str.length()==0)
            ans.add(prefix);
        else
        {
            for(int i=0;i<str.length();i++)
            {
                char current = str.charAt(i);
                String remaining=str.substring(0,i)+str.substring(i+1);
                permutations(remaining,ans,prefix+current);
            }
        }
    }


}
