import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double result = 0d;
        double [] values = readArray();
        System.out.println("Enter operation");
        String operation = scan.next();
        if (operation.equals("+")) {
            result = values[0] + values[1];
        } else if (operation.equals("-")) {
            result = values[0] - values[1];
        } else if (operation.equals("*")) {
            result = values[0] * values[1];
        } else if (operation.equals("/")) {
            result = values[0] / values[1];
        } else if (operation.equals("%")) {
            result = values[0] % values[1];
        } else {
            System.out.println("Incorrect operation");
        }
        System.out.println(result);
    }

    public static double[] readArray() {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of array poka chto 2 ");
        int length = scanner.nextInt();
        double[] array = new double[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter values");
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
