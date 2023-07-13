import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double result = 0d;
        double[] values = new double[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        values[0] = scanner.nextDouble();
        System.out.println("Enter second value");
        values[1] = scanner.nextDouble();
        System.out.println("Enter operation");
        int operation = scanner.nextInt();
        if (operation == 1) {
            result = values[0] + values[1];
        } else if (operation == 2) {
            result = values[0] - values[1];
        } else if (operation == 3) {
            result = values[0] * values[1];
        } else if (operation == 4) {
            result = values[0] / values[1];
        } else if (operation == 5) {
            result = values[0] / values[1] * 100;
        } else {
            System.out.println("Incorrect operation");
        }

        System.out.println("The result is " + result);




    }
}
