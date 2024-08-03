import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = in.nextInt();
        if(checkLeap(year))
            System.out.println("It is a leap year.");
        else
            System.out.println("It is not a leap year.");
    }

    private static boolean checkLeap(int year)
    {
        if(year % 400 == 0)
            return true;
        else if(year % 4 == 0 && year % 100 != 0)
            return true;
        return false;
    }
}
