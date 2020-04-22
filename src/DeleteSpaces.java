import java.util.Scanner;

public class DeleteSpaces {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String s = in.nextLine();
        String c = s.replaceAll(" ", "");

        System.out.println();
        Thread.sleep(700);

        System.out.println(c);

    }
}




