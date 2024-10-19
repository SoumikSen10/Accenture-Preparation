package ONCAMPUS_DRIVE;

/*

Find Sum of Negative Numbers

You are given four integers a, b, c, and d. Find the sum of the negative numbers out of these four numbers and print the result.

Note:
Print 0 if no negative number is present.

Input Format:
The input consists of a single line:
The line contains four integers a, b, c, and d.

Output Format:
Print the sum of negative numbers from the four numbers.

Example:

Input:
2 -3 -14 7

Output:
-17

Explanation:
Sum of -3 and -14 is -17, thus the output is -17.

*/

import java.util.Scanner;

public class NegativeSum
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        int sum=0;

        if(a<0)
            sum+=a;

        if(b<0)
            sum+=b;

        if(c<0)
            sum+=c;

        if(d<0)
            sum+=d;

        System.out.println(sum);

    }
}
