import java.util.Scanner;

public class DataOutputCondition {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();

        Thread.sleep(500);

        switch (number) {
            case 5:
            case 6:
            case 10:
                System.out.print("Данное значение имеется в константах");
                return;
            default:
                System.out.print("Такой константы нет!");
        }

    }
}
