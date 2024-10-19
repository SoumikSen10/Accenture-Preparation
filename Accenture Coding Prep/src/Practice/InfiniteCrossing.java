package Practice;/*

Infinite number of people are crossing a 2-d plane. They march in such a way that each integral x-coordinate will have exactly one person who moves along it in positive y direction, starting from (x,0).

You have to implement the function.

The functinon takes an integer matrix having n rows and 3 columns where n denotes the number of barriers. The ith barrier is defined by (xi,yi,di), which means that the barrier is blocking all the people who want to pass through points lying on line segment connecting (xi,yi) and (xi+d,yi). Once a person encounters a barrier, he stops.

The function takes an integer matrix barrier having n rows and 3 columns where n denotes the number of barriers. The ith barrier is defined by (xi,yi,di) , which means that the barrier is blocking all the people who want to pass through points lying on line segment connecting (xi,yi) and (xi+d,yi). Once a person encounters a barrier, he stops.

*/


/*
            x y d
Barrier 1 : 1 2 3
Barrier 2 : 3 4 2
Barrier 3 : 6 3 2
Barrier 4 : 9 3 2
Barrier 5 : 11 3 2

*/

import java.util.Scanner;

public class InfiniteCrossing
{
    public static int maximumBarrier(int n,int arr[][])
    {
        int points[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            points[i][0]=0;
            points[i][1]=0;
        }

        //step 1
        for(int i=0;i<n;i++)
        {
            points[i][0]=arr[i][0];
            points[i][1]=arr[i][0]+arr[i][2];
        }

        int totalpeopleblocked = 0;

        //step 2
        int startx=points[0][0];
        int endx=points[0][1];

        for(int i=1;i<n;i++)
        {
            if(points[i][0]<=points[i-1][1])
                endx=points[i][1];
            else
            {
                totalpeopleblocked+=endx-startx+1;
                startx=points[i][0];
                endx=points[i][1];
            }
        }
       totalpeopleblocked+=endx-startx+1;
      return totalpeopleblocked;
    }
}
