package Practice;/*

In Java, braces are used to group statements and declarations together. Each opening brace `{` should be accompanied with a closing brace `}`, otherwise, the compilation of code would result in a failure.

Given a piece of code, determine whether the code will give a compilation error or not.

- Sample Input 1: `{ { { } }`
- Sample Output 1: compilation error

- Sample Input 2: `{ } } { {`
- Sample Output 2: compilation error

*/

import java.util.Scanner;
import java.util.Stack;

public class Braces
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter braces combination :");
        String braces = in.next();
        boolean res = checkCompilation(braces);
        if(res)
            System.out.println("Successful");
        else
            System.out.println("Compilation error");
    }

    private static boolean checkCompilation(String braces)
    {
        Stack<Character> st = new Stack<>();

        for(int i=0;i<braces.length();i++)
        {
            if(braces.charAt(i)=='{')
                st.push(braces.charAt(i));
            else
            {
                if(st.empty())
                    return false;
                else
                st.pop();
            }
        }
        return st.empty();
    }


}
