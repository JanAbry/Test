package ch.css;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String Username;
        String Password;

        Password = "asdf";
        Username = "Jan";

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Username : ");
        String username = input1.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Password : ");
        String password = input2.next();

        if (username.equals(Username) && password.equals(Password)) {

            System.out.println("Access Granted! Welcome!");
        } else {
            System.out.println("Invalid Username or Password!");
        }
    }
}