package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] rsl = new Item[items.length];
        int size = 0;
        for (Item name : items) {
            if (name != null) {
                rsl[size] = name;
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = findAll();
        int size = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (key.equals(rsl[i].getName())) {
                rsl[size] = rsl[i];
                size++;
            }
        }
        rsl = Arrays.copyOf(rsl, size);
        return rsl;
    }
}