package ONCAMPUS_DRIVE;

/*

You are given a time in 24-hour format (e.g., 16:3 or 12:16). The task is to convert the given time into a 12-hour format.

Input:
Two integers, representing hours and minutes in 24-hour format.

Output:
Convert the 24-hour format time into a 12-hour format.

Example:
Input: 12 16

Output: 12 16

Explanation: 12 in the 24-hour format corresponds to 12 in the 12-hour format. Therefore, 12 remains unchanged, and the output is the same.

Input: 16 3

Output: 4 3
Explanation: In the 24-hour format, 16 corresponds to 4 in the 12-hour format (16 - 12 = 4). Therefore, the converted output for the given input should be 4 3.


*/

import java.util.Scanner;

public class ClockProblem
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int hr = in.nextInt();
         int min = in.nextInt();

         if(hr>=12)
         {
             if(hr>12)
              hr=hr-12;
             System.out.println(hr+":"+min+" PM");
         }
         else
         {
             if(hr==0)
                 hr=12;
             System.out.println(hr+":"+min+" AM");
         }

    }
}
