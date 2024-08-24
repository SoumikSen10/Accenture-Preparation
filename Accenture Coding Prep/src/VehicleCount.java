/*

An automobile company manufactures both two-wheeler and four-wheeler. A company manager wants to produce both acc to given data:

1st data - Total no of vehicles(two-wheeler + four-wheeler) = V
2nd data - Total no of wheels = W

Task is to find no of two-wheelers and four-wheelers produces based on V and W.
2<=W
W%2=0
V<W
Print "INVALID INPUT", if inputs didnot meet the constraints.

Example :
Input :
200 --> V
540 --> W

Output:
TW=130
FW=70

Explanation:
130+70=200
70*4+130*2=540

*/

// My approach was to solve it using simultaneous linear equations

import java.util.Scanner;

public class VehicleCount
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter total no of vehicles: ");
        int V = in.nextInt();

        System.out.print("Enter total no of wheels: ");
        int W = in.nextInt();

        displayBoth(V,W);

    }
    private static void displayBoth(int V,int W)
    {
        if(W<2 || W%2!=0 || V>W)
        {
            System.out.println("INVALID INPUT");
            return;
        }

        int TW=0,FW=0;
        int V1=V;
        V=V*2;
        W=W-V;
        FW=W/2;
        TW=V1-FW;
        System.out.println("No. of four-wheelers: "+FW);
        System.out.println("No. of two-wheelers: "+TW);
    }
}
