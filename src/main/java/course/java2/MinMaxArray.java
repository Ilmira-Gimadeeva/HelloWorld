package course.java2;

import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        searchMaxMin();
    }

    private static void searchMaxMin() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[20];

        System.out.println("Введите целые случайные числа от -10 до 10: ");


        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int minPositive = 0;
        int maxNegative = 0;
        int minPositiveIndex = 0;
        int maxNegativeIndex = 0;
        boolean containsMinPositive = false;
        boolean containsMaxNegative = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                minPositive = array[i];
                minPositiveIndex = i;
                containsMinPositive = true;
                break;
            }

            if (array[i] > 0 & array[i] < minPositive) {
                minPositive = array[i];
                minPositiveIndex = i;
                containsMinPositive = true;
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 & array[i] < maxNegative) {
                maxNegative = array[i];
                maxNegativeIndex = i;
                containsMaxNegative = true;
            }
        }

        if (containsMaxNegative && containsMinPositive) {
            array[minPositiveIndex] = maxNegative;
            array[maxNegativeIndex] = minPositive;
            System.out.println("Максимальный отрицательный элемент массива " + maxNegative + ", а минимальный " +
                    "положительный элемент массива " + minPositive);
        } else if (!containsMaxNegative && containsMinPositive) {
            System.out.println("Минимальный положительный элемент массива " + minPositive);
        } else if (containsMaxNegative && !containsMinPositive) {
            System.out.println("Максимальный отрицательный элемент массива " + maxNegative);
        }

        for (Integer num : array) {
            System.out.println(num);
        }
    }
}