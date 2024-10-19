package ONCAMPUS_DRIVE;

/*

You are developing a feature for an environmental awareness app that helps users to know how much area their tree's shadow covers. You have the distance D from a tree's trunk to the edge of the shadow. Your task is to calculate and return an integer value representing the shadow area of the canopy.

Note:
Round off the result to the nearest integer.

Input Specification:

input1: An integer value D, representing the distance from the tree trunk to the edge of the shadow.

Output Specification:
Return an integer value representing the shadow area of the canopy.

Example :

input : 5
output : 78

Explanation : Here, D = 5. So, area of the canopy would be 3.14*5*5=78.5. Therefore 78 will be ans.

*/

import java.util.Scanner;

public class AwarenessApp
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int D = in.nextInt();
        //The D distance acts as the radius of the circle formed by the tree's shadow
       double x = 3.14*D*D;
        System.out.println((int)x);
    }


}
