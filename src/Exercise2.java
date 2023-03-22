import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input your USD:");
        float usd = scn.nextFloat();

        float vnd = usd * 23000;

        System.out.println(vnd);
    }
}
