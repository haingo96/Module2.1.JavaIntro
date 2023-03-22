import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a :");
        double a = scanner.nextDouble();

        System.out.println("Input b :");
        double b = scanner.nextDouble();

        System.out.println("Input c : ");
        double c = scanner.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.println("Equation has no test");
        } else if (delta == 0) {
            System.out.println("test = " + (- b / (2 * a)));
        }else {
            System.out.println("test = " + (- b + Math.sqrt(delta) / (2 * a)) + " and " + (- b - Math.sqrt(delta) / (2 * a)));
        }
    }
}
