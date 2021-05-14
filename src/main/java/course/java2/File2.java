package course.java2;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class File2 {

    public static void main(String[] args) {
        String a = readFileAndOutput();
        if (a == null) {
            return;
        }
        Map<String, Integer> treeMap = sortAndCalculateStatistics(a);
        calculateMax(treeMap);
    }

    private static String readFileAndOutput() {
        String a = null;
        try (BufferedReader d = new BufferedReader(new FileReader("./src/main/resources/test2.txt"))) {
            a = d.lines().collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (a == null) {
            System.out.println("Файл пустой");
            return null;
        }

        System.out.println("Прочитан файл со следующим содержимым:");
        System.out.println(a + "\n");
        return a;
    }

    private static Map<String, Integer> sortAndCalculateStatistics(String a) {
        a = a.replace(",", "")
                .replace("!", "")
                .replace(".", "")
                .replace("\r\n", " ");
        String[] strArr = a.split(" ");
        Map<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        for (String str : strArr) {
            if (treeMap.containsKey(str)) {
                int val = treeMap.get(str);
                treeMap.put(str, ++val);
            } else {
                treeMap.put(str, 1);
            }
        }
        return treeMap;
    }

    private static void calculateMax(Map<String, Integer> treeMap) {
        System.out.println("Слова отсортированы, вот статистика по повторениям:");
        Map.Entry<String, Integer> max = null;
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            if (max == null) {
                max = entry;
            } else if (max.getValue() < entry.getValue()) {
                max = entry;
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nНаиболее часто повторяющееся слово: " + max.getKey());
        System.out.println("Кол-во повторений: " + max.getValue());
    }
}