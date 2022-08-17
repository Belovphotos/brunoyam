package com.lesson11.normal;
/*
1. ������� ����� RegistrationService, ���������� ����� registration � checkLoginAndPassword.

2. ����� registration ��������� �� ���� ��� ���������: login, password � confirmPassword.
����� registration �������� ����� checkLoginAndPassword, ������� ��� ��� ���������
(checkLoginAndPassword ���� ��������� ��� ���������). ����� checkLoginAndPassword
��������� ���������� ���������.

3. ����� login ������ ���� ������ 16 ��������. ���� login �� ������������� ����� ����������,
���������� ��������� ���������� WrongLoginException.

4. ����� password ������ ���� ������ 8 ��������. ����� password � confirmPassword
������ ���� �����. ���� password �� ������������� ���� �����������, ���������� ��������� WrongPasswordException.

5. WrongPasswordException � WrongLoginException - ���������������� ������,
����������� ���������� � ����� �������������� � ���� �� ���������, ������ ���������
��������� ���������� � �������� ��� � ����������� ������ Exception.

6. ��������� ���������� ���������� ������ ������ registration. ���������� try-catch.

7. �����  registration ������� �� ������� "����������� ������ �������" ��� ���������� ������.

8. ���� ����� checkLoginAndPassword �������� WrongLoginException, ���������� ������� �� �������
"����� ������ ��������� ����� 16 ��������". ���� �������� WrongPasswordException - "������ ������
��������� ����� 8 ��������. ���������� ����������� ������".
 */

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        RegistrationService registrationService = new RegistrationService();

        registrationService.registration("Belovphotos95", "qwerty123", "qwerty124");

        try {
            registrationService.checkLoginAndPassword("Belovphotos95", "qwerty123", "qwerty124");
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }
}
