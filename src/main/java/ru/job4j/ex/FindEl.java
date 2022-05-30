package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("element not found with this key");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] test = {"a", "b", "c", "d", "e"};
        try {
            int rsl = indexOf(test, "t");
            System.out.println(rsl);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}