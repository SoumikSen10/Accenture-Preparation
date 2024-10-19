package Practice;

import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        int a=0,b=1,c=0;
        for(int i=1;i<=n;i++)
        {
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
        }
    }
}