import java.util.Arrays;
import java.util.Scanner;

public class SortData {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] a = new int[in.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Введите значение для a[" + i + "]" + ": ");
            a[i] = in.nextInt();
        }
        bubbleSort(a);
    }

    public static void bubbleSort(int[] arraySort) {

        for (int i = arraySort.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arraySort[j] > arraySort[j + 1]) {
                    int f = arraySort[j];
                    arraySort[j] = arraySort[j + 1];
                    arraySort[j + 1] = f;
                }
            }
        }
        System.out.println(Arrays.toString(arraySort));
    }
}

