import java.io.*;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        try (Scanner scanner = new Scanner(new FileReader("src/in.txt"))) {
            String line;
            while (scanner.hasNext()) {
                line = scanner.nextLine().trim();
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Set<String> set = new HashSet<>();
        list.forEach(line -> {
            String words[] = line.split("[^a-zA-Z]+");
            for (String word : words) {
                set.add(word.toLowerCase());
            }
        });
        System.out.println(set);
    }
}

