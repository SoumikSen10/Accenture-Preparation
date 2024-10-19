package Practice;/*

Write a function to find roots of a quadratic ax^2 + bx + c = 0.

Note: The formula to find the roots of a quadratic equation is given below:

+x = (-b+((b^2-4ac))^0.5)/2a
-x = (-b-((b^2-4ac))^0.5)/2a

Example
Input 1:1
Input 2:-2
Input 3:3

Output: {3.0,-1.0}

Explanation: On substituting the values of a,b and c in the formula, the roots will be as follows:

+x=3.0
-x=-1.0

*/

import java.util.Scanner;

public class QuadraticEqn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();

        double discriminant = (b * b) - 4 * a * c;

        if (discriminant > 0) {
            double sqrtD = Math.sqrt(discriminant);
            double x1 = (-b + sqrtD) / (2 * a);
            double x2 = (-b - sqrtD) / (2 * a);
            System.out.println("Output: {" + x1 + ", " + x2 + "}");
        } else if (discriminant == 0) {
            double x1 = -b / (2 * a);
            System.out.println("Output: {" + x1 + "}");
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Output: {" + realPart + " + " + imaginaryPart + "i, " + realPart + " - " + imaginaryPart + "i}");
        }
    }
}


