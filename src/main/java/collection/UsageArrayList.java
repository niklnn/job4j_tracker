package collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Petr");
        name.add("Ivan");
        name.add("Stepan");
        for (String s : name) {
            System.out.print(s + " ");
        }
    }
}