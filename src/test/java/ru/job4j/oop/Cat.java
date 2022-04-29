package ru.job4j.oop;

public class Cat {
    private String name;
    private String food;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meal) {
        this.food = meal;
    }

    public void show() {
        System.out.println("Котенок " + this.name + " съел " + this.food);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.giveNick("Гав");
        cat.eat("котлету");
        cat.show();
        cat.giveNick("Черный");
        cat.eat("рыбу");
        cat.show();
    }
}