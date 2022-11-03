import java.util.Scanner;

import login.UserLogin;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name:");
        String name = sc.next();

        System.out.print("Type your password:");
        String password = sc.next();

        System.out.println("Now please confirm your name and password: ");

        System.out.print("Confirm your name:");
        String validName = sc.next();

        System.out.print("Confirm your password:");
        String validPassword = sc.next();

        UserLogin login = new UserLogin(name, password, validName, validPassword);

        login.register();


        sc.close();
    }
}
