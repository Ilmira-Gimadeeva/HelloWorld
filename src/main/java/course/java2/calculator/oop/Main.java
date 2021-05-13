package course.java2.calculator.oop;

public class Main {
    public static void main(String[] args) {
        Calc calculator = new CalcImpl();
        System.out.printf("%.4f\n", calculator.calculate());
    }
}
