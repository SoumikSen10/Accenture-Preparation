package ONCAMPUS_DRIVE;

/*

Find the Elevation of the Summit
You are on a hiking trail represented by an array A of length N, where the trail initially ascends and then descends, forming a single peak. Your task is to find and return an integer value representing the elevation of the summit.

Input:
N: an integer representing the length of the array.
Arr[]: an array representing the elevation at different points on the trail.

Output:
An integer representing the elevation of the summit.

Example:

Input:
N = 7
Arr = [1, 2, 3, 4, 3, 2, 1]

Output:
4

Input:
N = 2
Arr = [5, 3]

Output:
5

*/

import java.util.Scanner;

public class HikingTrail
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int peak=elevation(arr,n);
        System.out.println(peak);

    }

    private static int elevation(int[] arr,int n)
    {
        if(n==0)
            return -1;

        if(n==1)
            return arr[0];

        if(arr[n-1]>arr[n-2])
            return arr[n-1];

        for(int i=1;i<n-1;i++)
        {
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1])
                return arr[i];
        }

        // If the array length is 2, the highest number is the peak
        return Math.max(arr[0],arr[n-1]);
    }
}
