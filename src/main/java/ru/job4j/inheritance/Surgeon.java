package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private int weight;

    public Surgeon(String name, String surname, String education, int birthday, int weight) {
        super(name, surname, education, birthday);
        this.weight = weight;
    }

    public void testSurgeon() {
        System.out.println("surname: " + getSurname());
    }

    public int getWeight() {
        return weight;
    }
}
