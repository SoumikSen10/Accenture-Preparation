import java.util.Scanner;

public class AutoBiographicalNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String num = in.next();

        if (isAutobiographical(num)) {
            System.out.println("The number " + num + " is an autobiographical number.");
        } else {
            System.out.println("The number " + num + " is not an autobiographical number.");
        }
    }

    private static boolean isAutobiographical(String num) {
        int length = num.length();
        int[] count = new int[10];  // Array to count digit occurrences

        // Count occurrences of each digit
        for (int i = 0; i < length; i++) {
            int digit = num.charAt(i) - '0';
            if (digit >= 10) { // Check if it's a valid digit
                return false;
            }
            count[digit]++;
        }

        // Check if the number is autobiographical
        for (int i = 0; i < length; i++) {
            int expectedCount = num.charAt(i) - '0';
            if (count[i] != expectedCount) {
                return false;
            }
        }

        return true;
    }
}
