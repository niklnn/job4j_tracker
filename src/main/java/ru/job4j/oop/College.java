package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        /* создаем объект класса Freshman. */
        Freshman fm = new Freshman();
        /* приведение к типу родителя Student. */
        Student stF = fm;
        /* приведение к типу родителя Object. */
        Object objF = fm;
        /* Приведение типа при создании объекта. */
        Object obj = new Freshman();
        /* Приведение типа за счет понижения по иерархии. */
        Freshman fmO = (Freshman) obj;
    }
}