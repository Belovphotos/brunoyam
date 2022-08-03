package com.lesson5;

public class Easy {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFullName("Ivan");

        person.talk();
        person.move();
    }
}

class Person{
    private String fullName;
    private int age;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("Такой-то " + fullName + " говорит");
    }

    public void move(){
        System.out.println("Такой-то " + fullName + " ходит");
    }
}
