package ONCAMPUS_DRIVE;

/*

Print second smallest number from array.

*/

import java.util.Scanner;

public class SecondSmallest
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        int small=Integer.MAX_VALUE,secondSmall=Integer.MAX_VALUE;

        if(n<2)
            System.out.println("No second smallest");
        else {
            for (int i = 0; i < n; i++) {
                if (arr[i] < small) {
                    secondSmall = small;
                    small = arr[i];
                } else if (arr[i] > small && arr[i] < secondSmall) {
                    secondSmall = arr[i];
                }
            }

            if(secondSmall == Integer.MAX_VALUE)
                System.out.println("No second smallest");
            else
                System.out.println(secondSmall);
        }

    }
}
