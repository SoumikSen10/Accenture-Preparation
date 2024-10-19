package Practice;/*

Question:
Doug is fond of change, every now and then he tries to do new things. This time he caught up with a rod comprising of negative (N) and positive (P) charge. He is asked to calculate the maximum net electrostatic field possible in the region due to the rod.

Input:
In1: \[ 4 , 3 , 5 \]
In2: \[ P , N , P \]
In3: 3

Output:
600  (4 - 3 + 5) * 100 = 600

E.F. = Total Charge x 100

*/

import java.util.Scanner;

public class ElectrostaticCharge
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total no of charges: ");
        int n = in.nextInt();

        System.out.println("Enter charge values: ");
        int charges[]=new int[n];
        for(int i=0;i<n;i++)
        {
            charges[i]=in.nextInt();
        }

        System.out.println("Enter charge signs: ");
        char signs[]=new char[n];
        for(int i=0;i<n;i++)
        {
            signs[i]=in.next().charAt(0);
        }

        int netCharge=0;
        for(int i=0;i<n;i++)
        {
            if(signs[i]=='P')
                netCharge=netCharge+charges[i];
            else if(signs[i]=='N')
                netCharge=netCharge-charges[i];
        }

        System.out.println("Net Electrostatic field = "+netCharge*100);

    }
}
