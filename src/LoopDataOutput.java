public class LoopDataOutput {

    public static void main(String[] args) {

        for (int a = 1; a <= 50; a++) {
            if (a % 10 == 0) {
                System.out.println(a + " ");
            } else {
                System.out.print(a + " ");
            }
        }
    }
}
