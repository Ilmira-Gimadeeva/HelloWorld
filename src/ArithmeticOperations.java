import java.util.Scanner;

public class ArithmeticOperations {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число x: ");
        int x = in.nextInt();

        System.out.print("Введите число y: ");
        int y = in.nextInt();

        System.out.print("Введите число z: ");
        int z = in.nextInt();

        System.out.println();

        Thread.sleep(500);

        System.out.println("Вычисление: ");

        Thread.sleep(700);

        int average = (x + y + z) / 3;
        System.out.println(x + " + " + y + " + " + z + " / 3 = " + average);

        Thread.sleep(900);

        int division = average / 2;
        System.out.println(average + " / 2 = " + division);

        Thread.sleep(1200);

        System.out.println();

        if (division > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}