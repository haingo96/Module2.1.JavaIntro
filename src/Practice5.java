import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your month: ");
        int inputMonth = scn.nextInt();

        switch (inputMonth) {
            case 2 -> System.out.println("28 or 29");
            case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("31");
            case 4, 6, 9, 11 -> System.out.println("30");
        }
    }
}
