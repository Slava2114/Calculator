import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int  operation;
        double  firstValue, secondValue, result = 0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        firstValue = scanner.nextInt();
        System.out.println("Enter second value");
        secondValue = scanner.nextInt();
        System.out.println("Enter operation");
        operation = scanner.nextInt();
        if (operation == 1) {
            result = firstValue + secondValue;
        }
        else if (operation == 2) {
            result = firstValue - secondValue;
        }
        else if (operation == 3) {
            result = firstValue * secondValue;
        }
        else if (operation == 4) {
            result = firstValue / secondValue;
        }
        else System.out.println("Incorrect operation");

        System.out.println("The result is " + result);




    }
}
