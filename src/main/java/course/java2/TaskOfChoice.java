package course.java2;

import course.java2.Calculator;
import course.java2.MaximumElementArray;

import java.util.Scanner;

public class TaskOfChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию:\n" + "1 - запуститься выполнение калькулятора\n" + "2 - поиск максимального слова в массиве");

        char a = scanner.next().charAt(0);
        switch (a) {
            case '1':
                Calculator.calculate();
                break;
            case '2':
                MaximumElementArray.searchMax();
                break;
        }
    }
}
