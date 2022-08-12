package com.lesson6.hard;


/*
�������� ������ ������������, ���������� ����� Student � ����� Aspirant.
�������� ���������� �� �������� �������� ����� ������� ������ (����� �������� scientificWork).
����� Student �������� ����������: String firstName, lastName, group. � �����, double averageMark, ���������� ������� ������.

������� ���������� ���� Student, ������� ��������� �� ������ ���� Aspirant.
������� ����� getScholarship() ��� ������ Student, ������� ���������� ����� ���������:
- ���� ������� ������ �������� ����� 5, �� ����� 1750 ���.;
- ���� ������� ������ ������� ������ ��� ����� 4, �� ������ 5, �� ����� 1710 ���.;
- ����� �������� �� ������������� ���������.
�������������� ���� ����� � ������ Aspirant:
- ���� ������� ������ �������� ����� 5, �� ����� 1950 ���.;
- ���� ������� ������ ������� ������ ��� ����� 4, �� ������ 5, �� ����� 1910 ���.;
- ����� ��������� �� ������������� ���������.
������� ������ ���� Student, ���������� ������� ������ Student � Aspirant.
������� ����� getScholarship() ��� ������� �������� �������.
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
