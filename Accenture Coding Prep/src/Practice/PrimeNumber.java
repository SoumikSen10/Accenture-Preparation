package Practice;// Two functions written with different approaches

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = in.nextInt();
        System.out.println(primeCheck2(n));
    }

    private static String primeCheck(int n)
    {
       if(n<=1)
         return "NO";
       int count=0;
       for(int i=1;i*i<=n;i++)
       {
           if(n%i==0)
           {
               count++;
               if((n/i)!=i)
               {
                   count++;
               }
               if(count>2)
                   break;
           }
       }
       if(count==2)
           return "YES";
      return "NO";
    }

    private static String primeCheck2(int n) // T.C-O(n^0.5) , S.C-O(1)
    {
        if(n<=1)
           return "NO";

        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
                return "NO";
        }
        return "YES";
    }

}
