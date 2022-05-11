package ru.job4j.oop;

public class College {
    public static void main(String[] args) {
        Freshman fm = new Freshman();
        Student stF = fm;
        Object objF = fm;
        Object obj = new Freshman();
        Freshman fmO = (Freshman) obj;
    }
}