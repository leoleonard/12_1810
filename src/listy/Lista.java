package listy;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>();

        for(int i=0; i<100; i++) {
            ints.add(i);
        }

        System.out.println("ints.get(50) = " + ints.get(50));
        System.out.println("Ilość elementów na liście: " + ints.size());
        System.out.println("Czyszczę tablicę: ");
        ints.clear();
        System.out.println("Ilość elementów na liście: " + ints.size());
    }
}
