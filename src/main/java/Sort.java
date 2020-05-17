import java.util.Arrays;
import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] a = new int[in.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Введите значение для a[" + i + "]" + ": ");
            a[i] = in.nextInt();
        }
        selectionSort(a);
    }

    public static void selectionSort(int[] arrSort) {
        for (int i = 0; i < arrSort.length; i++) {
            int min = arrSort[i];
            int min_i = i;
            for (int j = i + 1; j < arrSort.length; j++) {
                if (arrSort[j] < min) {
                    min = arrSort[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = arrSort[i];
                arrSort[i] = arrSort[min_i];
                arrSort[min_i] = tmp;
            }
        }
        System.out.println(Arrays.toString(arrSort));
    }
}

