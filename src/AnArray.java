import java.util.Scanner;

public class AnArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int[] a = new int[in.nextInt()];

        for (int i = 0; i < a.length; i++) {
            System.out.print("Введите значение для a[" + i + "]" + ": ");
            a[i] = in.nextInt();
            System.out.println("a[" + i + "]" + " X 2 = " + a[i] * 2);
        }
    }
}
