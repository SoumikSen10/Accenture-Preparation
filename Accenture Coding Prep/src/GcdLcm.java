import java.util.Scanner;

// using Euclid's algorithm
public class GcdLcm
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = in.nextInt();

        System.out.print("Enter number 2: ");
        int b = in.nextInt();

        System.out.println("Gcd of two numbers is: "+gcd(a,b));

        System.out.println("Lcm of two numbers is: "+(a*b)/gcd(a,b));

    }

    private static int gcd(int a,int b)
    {
        while(a>0 && b>0)
        {
            if(a>b)
                a=a%b;
            else
                b=b%a;
        }
        if(a==0)
            return b;
        return a;
    }
}
