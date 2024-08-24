/*

Function Definition:
int CheckPassword(char str[], int n);
Task:
Implement the function that accepts a string str of size n as an argument and returns 1 if the given string str is a valid password; otherwise, return 0.

Conditions for a Valid Password:
At least 4 characters.
At least one numeric digit.
At least one capital letter.
Must not have a space or a slash /.
The starting character must not be a number.

*/

import java.util.Scanner;

public class ValidPassword
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the password: ");
        String pass = in.next();
        char[] passArr = pass.toCharArray();
        if(checkPassword(passArr, passArr.length) == 1)
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }

    private static int checkPassword(char[] passArr, int n)
    {
        // Check if the length is less than 4
        if(n < 4)
            return 0;

        // Check if the first character is a digit
        if(numStart(passArr[0]))
            return 0;

        boolean hasDigit = false;
        boolean hasCaps = false;
        boolean hasInvalidChar = false;

        // Traverse the entire password
        for(int i = 0; i < n; i++)
        {
            // Check for numeric digit
            if(numeric(passArr[i]))
                hasDigit = true;

            // Check for capital letter
            if(caps(passArr[i]))
                hasCaps = true;

            // Check for space or slash
            if(spsl(passArr[i]))
                hasInvalidChar = true;
        }

        // Check all conditions
        if(hasDigit && hasCaps && !hasInvalidChar)
            return 1;
        else
            return 0;
    }


    private static boolean numeric(char ch)
    {
        return ch >= '0' && ch <= '9';
    }

    private static boolean caps(char ch)
    {
        return ch >= 'A' && ch <= 'Z';
    }

    private static boolean spsl(char ch)
    {
        return ch == ' ' || ch == '/';
    }

    private static boolean numStart(char ch)
    {
        return numeric(ch); // Simply reuse numeric function
    }
}
