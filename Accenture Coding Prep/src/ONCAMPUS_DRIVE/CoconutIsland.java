package ONCAMPUS_DRIVE;

/*

You are stuck on an island where they only sell coconut sweets. A person can buy at most 1 box per day, with each box containing N pieces. To remain alive, you must consume E coconut sweets daily for D days, but the catch is that you cannot purchase sweets on Sundays.

Your task is to find and return an integer value representing the minimum number of times you have to buy coconut sweets to stay alive. If it is not possible, return -1.

Notes:
The week starts from Monday.
You cannot purchase sweets on Sundays.

Input Specification:
Input 1: An integer N, representing the number of coconut sweets per box.
Input 2: An integer E, representing the number of coconut sweets you must eat daily.
Input 3: An integer D, representing the total number of days.

Output Specification:
Return an integer representing the minimum number of times you need to buy coconut sweets. If it's not possible to survive, return -1.

*/

import java.util.Scanner;

public class CoconutIsland {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();  // Number of sweets per box
        int e = in.nextInt();  // Sweets needed per day
        int d = in.nextInt();  // Total number of days

        int ans = calculate(n, e, d);
        System.out.println(ans);
        in.close(); // Close the scanner to avoid resource leaks
    }

    private static int calculate(int n, int e, int d) {
        // Calculate total number of sweets required
        int totalSweetsRequired = d * e;

        // Calculate the number of Sundays (every 7th day is a Sunday)
        int sundays = d / 7;

        // Calculate the number of days you can actually buy sweets (excluding Sundays)
        int buyableDays = d - sundays;

        // Calculate the number of boxes required
        int totalBoxesRequired = (totalSweetsRequired % n == 0) ? totalSweetsRequired / n : (totalSweetsRequired / n) + 1;

        // If the number of boxes required exceeds the days available for purchasing, it's impossible
        if (totalBoxesRequired > buyableDays) {
            return -1;
        }

        // Otherwise, return the number of boxes required
        return totalBoxesRequired;
    }
}



/*

Key Insights:

Sunday restriction: For every week, you have 6 days to buy sweets.

Box limitation: You can only buy 1 box per day, and each box has N sweets.

Requirement: For each day, you need E sweets.

If requirements are more than what you can buy in a week: If the total requirement exceeds what you can buy in a week (given the limitation of 6 days), the answer is -1.

*/