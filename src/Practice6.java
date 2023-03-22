import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your year:");
        int inputYear = scn.nextInt();

        if ((inputYear % 4 == 0 && inputYear % 100 != 0)
                || (inputYear % 100 == 0 && inputYear % 400 == 0)) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
