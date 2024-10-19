package ONCAMPUS_DRIVE;

/*

You are given a function:
CheckPassword(char str[], int n)

Return 1 → Valid Password
Return 0 → Invalid Password
A string is a valid password if it satisfies the following conditions:

At least 4 characters.
At least 1 numeric character.
At least one capital letter.
No spaces or slashes (/).

*/

import java.util.Scanner;
public class ValidPassword {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.next();
        char[] str = password.toCharArray();
        int n = str.length;

        if (CheckPassword(str, n) == 1)
            System.out.println("Valid Password");
        else
            System.out.println("Invalid Password");
    }

    private static int CheckPassword(char[] str, int n) {
        // Check for minimum length
        if (n < 4) {
            return 0;  // Invalid password (too short)
        }

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasInvalidChar = false;

        // Single loop to check all conditions
        for (int i = 0; i < n; i++) {
            char ch = str[i];

            // Check for digits
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }

            // Check for uppercase letters
            if (ch >= 'A' && ch <= 'Z') {
                hasUpperCase = true;
            }

            // Check for invalid characters
            if (ch == ' ' || ch == '/') {
                hasInvalidChar = true;
            }
        }

        // If any invalid characters are found, return invalid
        if (hasInvalidChar) {
            return 0;
        }

        // Check if all the required conditions are met
        if (hasDigit && hasUpperCase) {
            return 1;  // Valid password
        }

        return 0;  // Invalid password (missing required elements)
    }
}
