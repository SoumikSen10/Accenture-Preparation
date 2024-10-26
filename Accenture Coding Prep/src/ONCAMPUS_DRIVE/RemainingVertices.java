package ONCAMPUS_DRIVE;

/*

You are given the coordinates of any two vertices of a square, denoted as (X1, Y1) and (X2, Y2). The task is to find the coordinates of the other two vertices of the square. If it is not possible to form a square using these two given vertices, return -1.

Input:
Coordinates (X1, Y1) and (X2, Y2)

Output:
Coordinates of the other two vertices, or -1 if a square cannot be formed.

Example:

Input:
X1 = 1, Y1 = 2
X2 = 3, Y2 = 4

Output:
(1, 4) and (3, 2)

Explanation:

Given the points (1, 2) and (3, 4), the remaining two points should be calculated as follows to form a square:

X3 = X1 and Y3 = Y2 → (1, 4)
X4 = X2 and Y4 = Y1 → (3, 2)

This forms a square when all four points are plotted.

Note: If the distance between the given two points does not allow forming a square, return -1.

*/

import java.util.Scanner;

public class RemainingVertices
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        int x3 = x1;
        int y3 = y2;
        int x4 = x2;
        int y4 = y1;

        if(distance(x1, y1, x2, y2) == distance(x3, y3, x4, y4) &&
                distance(x1, y1, x3, y3) == distance(x2, y2, x4, y4) &&
                distance(x1, y1, x4, y4) == distance(x2, y2, x3, y3))
        {
            System.out.println(x3+" "+y3);
            System.out.println(x4+" "+y4);
        }
        else
            System.out.println(-1);

    }

    private static int distance(int x1,int y1,int x2,int y2)
    {
        int d =(int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        return d;
    }

}
