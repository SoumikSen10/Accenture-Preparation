package Practice;

import java.util.Scanner;

public class StringContain
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1 = in.nextLine();
        System.out.println("Enter second string: ");
        String str2 = in.nextLine();
        if(str1.contains(str2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
