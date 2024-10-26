package ONCAMPUS_DRIVE;

/*

Daniel has a ball. He wants to find the ball's rebound height, which he dropped from height H with an initial velocity V. After the Nth rebound, the final velocity of the ball is Vn. Your task is to help him find and return an integer value representing the height to which the ball rebounds after N bounces.


Input Specification:
Input 1: An integer H, representing the initial height.
Input 2: An integer V, representing the initial velocity.
Input 3: An integer Vn, representing the final velocity.

Output Specification:
Return an integer value representing the height to which the ball rebounds after N bounces.

Example:

Input:
H = 100
V = 20
Vn = 10

Output:
25




*/

import java.util.Scanner;

public class ReboundHeight
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int H = in.nextInt();
        int V = in.nextInt();
        int Vn = in.nextInt();

        int reboundHeight = calculate(H,V,Vn);
        System.out.println(reboundHeight);

    }

    private static int calculate(int H,int V,int Vn)
    {
        double ePown = (V/Vn);

        return (int)(H*ePown*ePown);

    }

}
