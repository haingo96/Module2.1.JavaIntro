import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scn.nextLine();

        System.out.println("Hello: " + name);
    }
}
