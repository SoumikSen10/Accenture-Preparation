package ONCAMPUS_DRIVE;

/*

During a school break, the school children, boys and girls, formed a queue of n people in the canteen. Initially, the children stood in the order they entered the canteen. However, after a while, the boys started feeling awkward standing in front of the girls in the queue, so they started letting the girls move forward every second.

Rules:

The positions in the queue are sequentially numbered from 1 to n, where the person at position number 1 is served first.

If at time x a boy stands at the i-th position and a girl stands at the (i+1)-th position, then at time x+1, the i-th position will have a girl, and the (i+1)-th position will have a boy.

You are given the initial positions of the children in the queue at the initial moment of time. Determine the way the queue is going to look after t seconds.

Input:

The first line contains two integers, n and t (1 ≤ n, t ≤ 50), which represent:

n: the number of children in the queue.
t: the time after which the queue will transform into the arrangement you need to find.

The second line contains a string s, which represents the school children's initial arrangement. The string contains:

'B' representing a boy.
'G' representing a girl.

Output:
Print the string a that describes the arrangement after t seconds. If the i-th position has a boy after the needed time, then the i-th character in string a must equal "B", otherwise, it must equal "G".

Example:
Input:
5 1
BGGBG

Output:
GBGBG

Explanation:
After 1 second, the 'BG' in the second and third positions swaps, giving "GBGBG".

Approach:
You need to iterate through the queue for t seconds and swap adjacent 'B' and 'G' pairs each second.

*/

import java.util.Scanner;

public class QueueAtSchool {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // Number of children in the queue
        int t = in.nextInt(); // Number of seconds

        String s = in.next(); // Initial arrangement of the queue

        // Convert the string to a character array for easier swapping
        char[] queue = s.toCharArray();

        // Loop for t seconds
        while (t-- > 0) {
            // Traverse through the queue to find 'B' followed by 'G'
            for (int i = 0; i < n - 1; i++) {
                if (queue[i] == 'B' && queue[i + 1] == 'G') {
                    // Swap 'B' and 'G'
                    queue[i] = 'G';
                    queue[i + 1] = 'B';

                    // Move to the next pair to avoid double swapping
                    i++;
                }
            }
        }

        // Convert the character array back to a string and print the result
        System.out.println(new String(queue));
    }
}

