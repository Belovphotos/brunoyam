package com.lesson6.hard;

public class Student {

    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGroup() {
        return group;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student(String firstName, String group, double averageMark) {
        this.firstName = firstName;
        this.group = group;
        this.averageMark = averageMark;
    }

    private String lastName;
    private String group;
    private double averageMark;

    public void getScholarship() {
        if (getAverageMark() == 5.0) {
            System.out.println("Стипендия студента: 1750.");
        } else if (getAverageMark() >= 4 && getAverageMark() < 5){
            System.out.println("Стипендия студента: 1710.");
        } else {
            System.out.println("Студент без стипендии.");
        }
    }

}
