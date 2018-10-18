package one;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Numbers {
    public static void main(String[] args) throws IOException {

        File file = new File("src/one/numbers.csv");
        Map<Integer, Integer> list = new TreeMap<>();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            Integer number = Integer.parseInt(line);
            if (list.get(number) == null) {
                list.put(number, 1);
            } else {
                int counter = list.get(number) + 1;
                list.put(number, counter);
            }
        }

        for (Integer numbers: list.keySet()) {
            System.out.println(numbers + " - liczba wystąpień: " + list.get(numbers));
        }



    }
}
