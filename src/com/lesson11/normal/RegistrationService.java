package com.lesson11.normal;

public class RegistrationService {
    public void registration(String login, String password, String confirmPassword){
        try {
            checkLoginAndPassword(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            throw new RuntimeException(e);
        } catch (WrongPasswordException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length()> 16){
            throw new WrongLoginException("Login must be less than 16 characters");
        }
        if (password.length() <= 8 && !password.equals(confirmPassword)){
            throw new WrongPasswordException("Password must be less than 8 characters. Passwords must match");
        }
    }
}
