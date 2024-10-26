package ONCAMPUS_DRIVE;

/*

You are the manager of a hotel. You have a list of rooms that are already reserved, provided in an array A of size N. You also have the total number of rooms, T. Your task is to find and return the integer value representing the total number of vacant rooms.

Input Specification:

Input 1: An integer array A representing the reserved rooms.
Input 2: An integer N, representing the count of reserved rooms.
Input 3: An integer T, representing the total number of rooms.

Output Specification:

Return an integer value representing the total number of vacant rooms.

Example:

Input:
A = [1, 2, 3, 4, 5, 6, 7, 8]
N = 8
T = 10

Output:
2

Explanation:
There are a total of 10 rooms (T = 10).
8 rooms are reserved (N = 8), and the list of reserved rooms is [1, 2, 3, 4, 5, 6, 7, 8].
Therefore, the number of vacant rooms is T - N = 10 - 8 = 2.


*/

import java.util.HashSet;
import java.util.Scanner;

public class VacantRooms
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[]=new int[n];

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
            set.add(arr[i]);
        }

        int t = in.nextInt();
        int count=0;

        for(int i=1;i<=t;i++)
        {
            if(!set.contains(i))
                count++;
        }

        System.out.println(count);

    }
}
