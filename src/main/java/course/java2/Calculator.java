package course.java2;

import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double d = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double e = scanner.nextDouble();

        System.out.println("Select operation (+,-,*,/): ");

        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.printf("Sum: %.4f\n", addition(d, e));
                break;
            case '-':
                System.out.printf("Sub: %.4f\n", subtraction(d, e));
                break;
            case '*':
                System.out.printf("Mult: %.4f\n", multiplication(d, e));
                break;
            case '/':
                System.out.printf("Div: %.4f\n", division(d, e));
                break;
        }
    }

    /**
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Результат сложения
     */

    private static double addition(double a, double b) {
        return (a + b);
    }

    /**
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Результат вычитания
     */
    private static double subtraction(double a, double b) {
        return (a - b);
    }

    /**
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Результат умножения
     */
    private static double multiplication(double a, double b) {
        return (a * b);
    }

    /**
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Результат деления
     */
    private static double division(double a, double b) {
        return (a / b);
    }
}