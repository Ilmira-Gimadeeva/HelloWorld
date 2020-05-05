import java.io.*;

public class File {

    public static void main(String[] args) {
        String a;
        try (BufferedReader d = new BufferedReader(new FileReader("./src/main/resources/test.txt"))) {
            while ((a = d.readLine()) != null) {
                System.out.println(a);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}