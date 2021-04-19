package course.java2;

import java.util.Scanner;

public class MaximumElementArray {
    public static void main(String[] args) {
        searchMax();
    }

    public static void searchMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int arrLength = scanner.nextInt();

        if (arrLength <= 0) {
            System.out.println("Задана отрицательная или нулевая длина массива");
            return;
        }

        System.out.println("Введите слова:");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if (a.length() == 0) {
            System.out.println("Вы ничего не ввели");
            return;
        }

        String[] array = a.split(" ");

        if (array.length > arrLength) {
            System.out.println("Введенное количество слов превышает длину массива");
            return;
        }

        String max = "";

        for (int i = 0; i < array.length; i++) {
            if (array[i].length() > max.length()) {
                max = array[i];
            }
        }
        System.out.println("Самое длинное слово: " + max);
    }
}