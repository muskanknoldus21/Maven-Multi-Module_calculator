import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Add ");
        System.out.println("Press 2 for Subtract ");
        System.out.println("Press 3 for Multiply ");
        System.out.println("Press 4 for Divide ");

        int option = sc.nextInt();

        System.out.println("Enter two numbers: ");

        int x = sc.nextInt();
        int y = sc.nextInt();

        final int multi = 3;
        final int max = 4;

        Calculator calc = new Calculator();

        if (option == 1) {
            calc.add(x,y);

        } else if (option == 2) {
            calc.subtract(x, y);

        } else if (option == multi) {
            calc.multiply(x, y);

        } else if (option == max) {
            calc.divide(x, y);

        } else {
            System.out.println("Incorrect Choice");
        }

    }
}
