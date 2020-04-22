import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первую строку: ");
        String s = in.nextLine();
        int len1 = s.length();

        System.out.print("Введите вторую строку: ");
        String d = in.nextLine();
        int len2 = d.length();

        System.out.println();
        Thread.sleep(800);

        if (len1 > len2) {
            System.out.println("Первая строка длиннее второй");
        } else if (len1 < len2) {
            System.out.println("Вторая строка длиннее первой");
        } else {
            System.out.println("Строки равны");
        }
    }
}