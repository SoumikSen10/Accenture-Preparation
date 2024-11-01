package Practice;/*

A has Purchased N apples for B and C.
Now he wants to share all the apples with his friends. One apple typically weighs between 100 and 200 grams. A naturally wants to protect his pals.
Since B and C received an identical quantity of apples, the weight of the apple they received must also be equal .
A, However is unable to divide an apple into multiple pieces because he is currently without a knife. If there is a fair way to
distribute all the apples among his friends, let him know.

Input:
3 100 200 100 //n=3 and there are 3 apples with weights 100,200,100

Output:
Yes

*/

import java.util.Arrays;
import java.util.Scanner;

public class MovingApples {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];

        System.out.println("Enter weights of apples: ");
        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        if (check(arr, N))
            System.out.println("YES");
        else
            System.out.println("NO");
    }

    private static boolean check(int[] arr, int N) {
        int b = 0, c = 0;

        // Step 1: Sort the array to facilitate greedy distribution
        Arrays.sort(arr);

        // Step 2: Reverse the sorted array to have larger elements first
        int i = 0;
        int j = N - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Step 3: Distribute the apples one by one to keep the weight balanced
        for (int p = 0; p < N; p++) {
            if (b <= c)
                b += arr[p]; // Assign the current apple to B if its total weight is less or equal to C's
            else
                c += arr[p]; // Otherwise, assign it to C
        }

        // Step 4: Check if the total weights of B and C are equal
        return b == c;
    }
}

