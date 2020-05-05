import java.io.*;

public class DataRecording {

    public static void main(String[] args) throws InterruptedException {
        String a;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для остановки записи введите stop! ");

        Thread.sleep(800);

        try (FileWriter c = new FileWriter("./src/main/resources/file.txt")) {
            System.out.println("Введите данные: ");
            do {
                a = b.readLine();

                if (a.compareTo("stop!") == 0) break;

                a = a + "\r\n";
                c.write(a);
            }
            while (a.compareTo("stop!") != 0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
