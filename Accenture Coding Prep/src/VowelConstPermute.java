import java.util.Scanner;

public class VowelConstPermute
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = in.next();
        s=s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u')
                count++;
        }
        //System.out.println(count);
        System.out.println("Result : "+factorial(count));
    }

    private static int factorial(int n)
    {
        if(n<=1)
            return n;
        return n*factorial(n-1);
    }

}
