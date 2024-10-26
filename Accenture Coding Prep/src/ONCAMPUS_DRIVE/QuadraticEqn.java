package ONCAMPUS_DRIVE;

/*

Given a quadratic equation in the form 𝑎𝑥^2+𝑏𝑥+𝑐, the task is to find the roots of the equation.

Approach
Calculate the Discriminant


Example
For a given quadratic equation, the steps to solve are:

Calculate the discriminant using
D=b^2 −4ac.

If D>0, compute both roots using the formula mentioned.
If D=0, compute the single root using the simplified formula.

*/

import java.util.Scanner;

public class QuadraticEqn
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int a = in.nextInt();
         int b = in.nextInt();
         int c = in.nextInt();

         findRoots(a,b,c);
    }

    private static void findRoots(int a,int b,int c)
    {
        if (a == 0)
        {
            System.out.println("Invalid");
            return;
        }

        int d = b*b - 4*a*c;

        double sqrt_val = Math.sqrt(Math.abs(d));

        if(d>0)
        {
            System.out.println("Roots are real and different");
            System.out.println((double)(-b + sqrt_val)/(2*a));
            System.out.println((double)(-b - sqrt_val)/(2*a));
        }
        else if (d==0)
        {
            System.out.println("Roots are real and same");
            System.out.println(-(double)b /(2*a));
        }
        else
        {
            System.out.println("Roots are complex");
            System.out.println(-(double)b /(2*a) + " +i");
            System.out.println(sqrt_val /(2*a) );
            System.out.println(-(double)b /(2*a) + " -i");
            System.out.println(sqrt_val /(2*a));
        }

    }
}
