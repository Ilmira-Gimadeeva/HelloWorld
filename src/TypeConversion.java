import java.util.Scanner;

public class TypeConversion {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        String s = in.nextLine();
        int x = Integer.parseInt(s);

        System.out.println(s);

        Thread.sleep(500);

        System.out.println(x);

        Thread.sleep(500);

        System.out.println((double)x);
    }
}
