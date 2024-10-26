package ONCAMPUS_DRIVE;

/*

A maid works in a circular colony of houses. There are n houses in the colony arranged in a circular manner. The maid is assigned
m tasks, where each task specifies a house number that the maid needs to visit. Moving from one adjacent house to another takes 1 unit of time. The maid starts at house number 1.

Objective: The task is to find the minimum amount of time the maid needs to complete all m tasks.

Details and Input Format:

The colony has n houses numbered sequentially from 1 to n.
The maid needs to complete m tasks.
The maid starts at house number 1.
For each task, the maid must move to the specified house.

Input:
n and m where:

(n ≤ 100) is the number of houses.
(m ≤ 100) is the number of tasks.
A sequence of
m integers representing the house numbers that the maid must visit.

Output: Print the minimum amount of time it takes for the maid to complete all tasks.

Example:
Input:
n = 4
m = 3
task = [3, 2, 3]

Output:
6

Explanation:

The maid starts at house 1.
Task 1: Move from house 1 to house 3 → Takes 2 units of time.
Task 2: Move from house 3 to house 2 → Takes 1 unit of time.
Task 3: Move from house 2 to house 3 → Takes 1 unit of time.
Total time = 2 + 1 + 1 = 6.

*/

import java.util.Scanner;

public class CircularMotion
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int tasks[] = new int[m];

        for(int i=0;i<m;i++)
            tasks[i]=in.nextInt();

        int minTime=0;
        int curr = 1;  // start at house 1

        for (int i = 0; i < m; i++) {
            int diff = tasks[i] - curr;

            if (diff < 0) {
                // If diff is negative, we need to move in a circular manner
                minTime += n + diff;
            } else {
                minTime += diff;
            }

            // Update current position
            curr = tasks[i];
        }


        System.out.println(minTime);
    }
}
