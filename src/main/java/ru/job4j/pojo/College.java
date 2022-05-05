package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Nikolai Nikolaevich");
        student.setGroup("Java");
        student.setDateOfAdmission(2022);
        System.out.println(student.getFullName()
                + System.lineSeparator() + student.getGroup()
                + System.lineSeparator() + student.getDateOfAdmission());
    }
}