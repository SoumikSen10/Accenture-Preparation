package ONCAMPUS_DRIVE;

import java.util.Scanner;

/*

Mr. Professor is a great scientist, but he is not able to find a solution to one problem. There are N straight lines that are not parallel, and no three lines go through the same point. The lines divide the plane into M regions. Write a function to find out the maximum number of such regions he can get on the plane.

Input Specification:
input1: An integer N representing the number of straight lines (0 <= N <= 100).
Output Specification:
Return the maximum number of regions.

*/
public class RegionsPlane
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // no. of straight lines
        int regions=0;
        for(int i=1;i<=n;i++)
//        {
//            regions+=i;
//        }
//        System.out.println(regions+1);

            // easier optimized version
            regions = n*(n+1)/2;
        System.out.println(regions+1);
    }
}

/*

For `n` straight lines, the number of regions `R(n)` created can be calculated using the formula:

R(n) = (n * (n + 1)) / 2 + 1

Explanation:
- When there are 0 lines, there is only 1 region (the entire plane).
- When the first line is added, it divides the plane into 2 regions.
- When a second line is added, it can intersect the first line and create 2 more regions, making the total 4 regions.
- For each additional line, it can intersect all the previous lines, and the number of new regions introduced is equal to the number of previous lines it intersects plus 1.
- This pattern can be generalized as a sum of the first `n` integers, plus 1 (for the whole plane).

The formula for the number of regions formed by `n` lines is:
R(n) = n * (n + 1) / 2 + 1

Examples:
- For 0 lines: 1 region.
- For 1 line: 2 regions.
- For 2 lines: 4 regions.
- For 3 lines: 7 regions.
- For 4 lines: 11 regions.

*/