import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String s = in.nextLine();

        System.out.print("Десятичное представление: " + (Integer.parseInt(s, 2)));
    }
}