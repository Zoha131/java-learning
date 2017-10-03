import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<String> myStrCol = new ArrayList<>();
        myStrCol.add("hello");
        myStrCol.add("hi");
        myStrCol.add("bye");
        myStrCol.add("eeeee");

        ArrayList<String> sublist = new ArrayList<>();

        for (int a : myArray) {
            System.out.printf("%d%n", a);
        }

        for (String a : myStrCol) {
            System.out.printf("%s ", a);
        }
    }
}

class z_cp implements Comparable<z_cp> {

    @Override
    public int compareTo(z_cp z_cp) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
 