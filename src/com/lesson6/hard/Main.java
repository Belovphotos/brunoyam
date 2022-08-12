package com.lesson6.hard;


/*
Создайте пример наследования, реализуйте класс Student и класс Aspirant.
Аспирант отличается от студента наличием некой научной работы (имеет свойство scientificWork).
Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark, содержащую среднюю оценку.

Создать переменную типа Student, которая ссылается на объект типа Aspirant.
Создать метод getScholarship() для класса Student, который возвращает сумму стипендии:
- если средняя оценка студента равна 5, то сумма 1750 руб.;
- если средняя оценка студена больше или равно 4, но меньше 5, то сумма 1710 руб.;
- иначе студенту не выплачивается стипендия.
Переопределить этот метод в классе Aspirant:
- если средняя оценка студента равна 5, то сумма 1950 руб.;
- если средняя оценка студена больше или равно 4, но меньше 5, то сумма 1910 руб.;
- иначе аспиранту не выплачивается стипендия.
Создать массив типа Student, содержащий объекты класса Student и Aspirant.
Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ivan", "RSK-13", 5.0);
        Student student2 = new Student("Pavel", "RSK-13", 4.3);
        Student student3 = new Student("Denis", "RSK-13", 3.9);
        
        Student aspirant1 = new Aspirant("Alexander", "SZTU-18", 5.0);
        Student aspirant2 = new Aspirant("Alexander", "SZTU-18", 4.2);
        Student aspirant3 = new Aspirant("Alexander", "SZTU-18", 3.0);
        
        Student[] students = {student1,student2, aspirant1, aspirant3, student3, aspirant2};
        for (Student learningPeople :
                students) {
            learningPeople.getScholarship();
        }
    }
}
