package ONCAMPUS_DRIVE;

/*

You are given a circle with a certain radius, R. You are provided with an initial point on the circle with coordinates (x, y), and a target point on the circle with coordinates (x', y'). Your task is to determine the number of rotations required to move from the initial point (x, y) to the target point (x', y') along the circumference of the circle.

Given:

R: Radius of the circle
(x, y): Coordinates of the initial point on the circle
(x', y'): Coordinates of the target point on the circle

Output:
Return the number of rotations (full or partial) required to move from (x, y) to (x', y').

Example:

If the distance along the circumference between (x, y) and (x', y') is half of the circle's circumference, then the output should be 0.5 rotations.
If the distance between the points covers a full circle's circumference, the output should be 1 rotation.

Approach:

Calculate the distance between the two points (x, y) and (x', y') along the circumference of the circle.

Find the total circumference of the circle using the formula
C=2πR.
Determine the number of rotations by dividing the distance between the points by the total circumference.

*/

import java.util.Scanner;

public class CircleRotations
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int tx = in.nextInt();
        int ty = in.nextInt();

        double d = distance(x,y,tx,ty);

        int r =in.nextInt();

        int rotations = (int)Math.ceil(d/(2*3.14*r));
        System.out.println(rotations);
    }

    private static double distance(int x,int y,int tx,int ty)
    {
        return Math.sqrt((tx-x)*(tx-x) + (ty-y)*(ty-y));
    }

}
