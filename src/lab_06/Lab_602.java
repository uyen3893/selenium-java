package lab_06;

import java.util.Scanner;

public class Lab_602 {

    public static void main(String[] args) {
        int totalInput = 0;
        while (totalInput < 3) {
            String password = inputPassword();
            if(isValidPassword(password)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("Invalid password");
                totalInput++;
            }
        }
    }

    public static String inputPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your password: ");
        return scanner.next();
    }

    public static boolean isValidPassword(String newPassword) {
        String myPassword = "password123";
        if (newPassword.equals(myPassword)) {
            return true;
        } else {
            return false;
        }
    }

}
