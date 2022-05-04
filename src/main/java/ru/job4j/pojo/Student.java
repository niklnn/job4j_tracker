package ru.job4j.pojo;

public class Student {
    private String fullName;
    private String group;
    private int dateOfAdmission;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(int dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}