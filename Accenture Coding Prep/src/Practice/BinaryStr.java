package Practice;

import java.util.Scanner;

/*

Write a function CalculateBinaryOperations(str) that accepts the string as an argument or parameter. The string should contain the binary numbers

a. A means the AND operation
b. B means the OR operation
c. C means the XOR operation

By scanning the given string from left to right you've to calculate the string and by taking one operator at a time then return the desired output.

Conditions:
1. The priority of the operator is not required
2. The length of the string is always Odd
3. If the length of the string is null then return -1

Sample Test Case :
Input:
1C0C1C1A0B1

Output:
1

*/
import java.util.Scanner;

public class BinaryStr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the binary string: ");
        String str = in.next();
        int res = CalculateBinaryOperations(str);
        System.out.println("Output is : " + res);
    }

    private static int CalculateBinaryOperations(String str)
    {
        int n = str.length();
        if (n == 0 || n % 2 == 0)
            return -1;

        int ans = str.charAt(0) - '0'; // Initialize with the first binary digit

        for (int i = 1; i < n; i += 2)
        {
            char op = str.charAt(i);
            int nextDigit = str.charAt(i + 1) - '0';

            if (op == 'A')
            {
                ans = ans & nextDigit;
            }
            else if (op == 'B')
            {
                ans = ans | nextDigit;
            }
            else if (op == 'C')
            {
                ans = ans ^ nextDigit;
            }
        }
        return ans;
    }
}

