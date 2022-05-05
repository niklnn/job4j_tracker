package ru.job4j.pojo;

public class Product {
    private String name;
    private int count;
    private static int numb = 0;

    public Product(String name, int count) {
        this.name = name;
        this.count = count;
        numb++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public static int counter() {
        return numb;
    }
}
