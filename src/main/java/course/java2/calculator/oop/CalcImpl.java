package course.java2.calculator.oop;

import java.util.Scanner;

public class CalcImpl implements Calc {

    @Override
    public double calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double d = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double e = scanner.nextDouble();

        System.out.println("Select operation (+,-,*,/): ");

        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                return sum(d, e);
            case '-':
                return sub(d, e);
            case '*':
                return multiply(d, e);
            case '/':
                return div(d, e);
            default:
                System.out.println("Не удалось опознать выбранную операцию: " + c);
                return 0;
        }
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double sub(double a, double b) {
        return a - b;
    }

    private double div(double a, double b) {
        return a / b;
    }
}
