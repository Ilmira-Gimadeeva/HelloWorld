import java.io.*;
import java.io.File;
import java.util.Scanner;

public class UnloadingData {

    public static void main(String[] args) throws InterruptedException {
        String fileName = "./src/main/resources/text.txt";
        int linesCounts = read(fileName);
        write(linesCounts, fileName);
//      read(fileName);
    }

    private static int read(String fileName) throws InterruptedException {
        String line;
        int linesCount = 0;

        try {
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(fileName));
            while ((line = lineNumberReader.readLine()) != null) {
                System.out.println(line);
                linesCount++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
        Thread.sleep(800);

        System.out.println("Максимально вводимое число строк: " +linesCount);
        return linesCount;
    }

    public static void write(int linesCounts, String fileName) {
        File file = new File(fileName);
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fileWriter = new FileWriter(file);
            for (int i = 0; i < linesCounts; i++) {
                fileWriter.write(sc.nextLine() + "\n");
            }
            sc.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
