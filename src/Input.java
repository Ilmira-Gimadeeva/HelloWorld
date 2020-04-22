import java.util.Scanner;

public class Input{

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();

        System.out.println();
        Thread.sleep(500);

        System.out.println(s);

    }
}