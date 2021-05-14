package course.java2.calculator.oop;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcImpl implements Calc {

    @Override
    public double calculate() {
        Scanner scanner = new Scanner(System.in);
        double d;
        System.out.println("Enter the first number:");
        try {
            d = scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Вы ввели первое значение, не являющееся числом");
        }

        double e;
        System.out.println("Enter the second number:");
        try {
            e = scanner.nextDouble();
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Вы ввели второе значение, не являющееся числом");
        }
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
                throw new IncorrectOperationException("Не удалось опознать выбранную операцию: " + c);
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
        if (b == 0) {
            throw new ArithmeticException("Ошибка: Вы ввели второе число равное нулю. Нельзя делить на ноль.");
        }
        return a / b;
    }
}
