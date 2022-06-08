package lab_06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_603 {
    public static void main(String[] args) {
        String newString = convertCharToString(extractNumberChar(inputString()));
        System.out.print("Your new string: ");
        System.out.println(newString);
    }

    public static String inputString() {
        System.out.print("Please input your string: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    public static List extractNumberChar(String oldString) {
        char[] charArray = oldString.toCharArray();
        List<Character> newCharArray = new ArrayList<>();
        for (char character : charArray) {
            if (Character.isDigit(character)) {
                newCharArray.add(character);
            }
        }
        return newCharArray;
    }
    
    public static String convertCharToString(List<Character> charArray) {
        String newString = "";
        for (char character: charArray) {
            newString += character;
        }
        return newString;
    }
}
