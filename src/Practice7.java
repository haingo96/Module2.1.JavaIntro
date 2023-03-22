import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your weight:");
        double weight = scanner.nextDouble();

        System.out.println("Input your height:");
        double height = scanner.nextDouble();

        double bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Under weight");
        } else if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Over weight");
        } else if (30 <= bmi) {
            System.out.println("Obese");
        }
    }
}
