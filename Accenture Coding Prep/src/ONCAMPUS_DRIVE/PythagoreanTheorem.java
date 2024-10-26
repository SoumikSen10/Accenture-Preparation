package ONCAMPUS_DRIVE;

/*

You are given two integers, A and B. A represents a coordinate on the X-axis (0, A) and B represents a coordinate on the Y-axis (B, 0). These are two coordinate points of a right-angled triangle, with the third point being the origin (0, 0).

You are tasked with calculating the length of the hypotenuse for N such triangles based on the inputs provided.


If the length of the hypotenuse is a decimal, round it up to the next greater integer.

Input Format:
The first line contains an integer N denoting the number of triangles.
The next N lines contain two space-separated integers representing A and B, respectively.

Output Format:
The output consists of N lines, each representing the length of the hypotenuse for each triangle.

Example:

Input:
3
3 4
5 12
8 15

Output:
5
13
17

*/

import java.util.Scanner;

public class PythagoreanTheorem
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        while(N-- >0)
        {
            int A = in.nextInt();
            int B = in.nextInt();

            int hypo = generate(A,B);
            System.out.println(hypo);

        }

    }

    private static int generate(int A,int B)
    {
        return (int)Math.ceil(Math.sqrt(A*A+B*B));
    }
}
