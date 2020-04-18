import java.util.Scanner;

public class TheMatrix {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int rows = in.nextInt();
        System.out.print("Введите количество столбцов: ");
        int columns = in.nextInt();
        int[][] a = new int[rows][columns];

        for (int b = 0; b < rows; b++) {
            for (int c = 0; c < columns; c++) {
                System.out.print("Введите значение для ячейки a[" + b + "][" + c + "]" + ":");
                a[b][c] = in.nextInt();
            }
        }
        for (int i = 0; i < columns; i++) {
            System.out.println("a[0][" + i + "]" + " X 3 = " + a[0][i] * 3);

        }
    }
}