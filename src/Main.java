import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation: +, -, *, / or type 'exit' to leave the app. ");
            String operation = input.nextLine();

            if (operation.equals("exit")) {
                break;
            }

            System.out.println("Enter the first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the second number:");
            double num2 = input.nextDouble();

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by Zero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.println("The result is: " + result);
            input.nextLine();
        }

        input.close();

    }
}