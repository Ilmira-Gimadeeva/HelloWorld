import java.util.Scanner;

public class BinaryFormat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите двоичное число: ");
        String s = in.nextLine();
        int num = 0;
        int position = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int value = Character.getNumericValue(s.charAt(position));
            if (value < 2) {
                num += value * Math.pow(2, i);
                position++;
            } else {
                System.out.println("Вы ввели не двоичное число!");
                return;
            }
        }
        System.out.print("Десятичное представление: " + num);
    }
}