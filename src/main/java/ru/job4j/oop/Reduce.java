package ru.job4j.oop;

public class Reduce {
    private int[] array;

    public void to(int[] array) {
        this.array = array;
    }

    public void print() {
        for (int index : array) {
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 6};
        Reduce reduce = new Reduce();
        reduce.to(array);
        reduce.print();
    }
}