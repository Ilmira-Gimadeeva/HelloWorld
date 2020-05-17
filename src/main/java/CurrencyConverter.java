import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите курс доллара: ");
        BigDecimal a = in.nextBigDecimal();

        System.out.print("Введите количество рублей: ");
        BigDecimal b = in.nextBigDecimal();

        System.out.println("Курс доллара = " + a );
        System.out.println("Количество рублей = " + b);
        System.out.println("Итого: " + b.divide(a,2, RoundingMode.HALF_UP));
    }
}
