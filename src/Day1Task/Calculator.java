package Day1Task;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueCalc;

        do {
            System.out.println("\n--- Console-Based Calculator ---");
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result = " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result = " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result = " + result);
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result = " + result);
                    } else {
                        System.out.println("Error: Cannot divide by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator!");
            }

            System.out.print("Do you want to perform another calculation? (y/n): ");
            continueCalc = scanner.next().toLowerCase().charAt(0);

        } while (continueCalc == 'y');

        System.out.println("Calculator exited. Thank you!");
        scanner.close();
    }
}

