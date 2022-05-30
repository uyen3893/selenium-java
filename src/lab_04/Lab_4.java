package lab_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> array = generateArrayList(inputArrayLength());
        boolean isContinuing = true;
        while(isContinuing) {
            showMenu();
            int option = inputOption();
            switch (option) {
                case 1:
                    printAllNumbers(array);
                    break;
                case 2:
                    printMaximumNumber(array);
                    break;
                case 3:
                    printMinimumNumber(array);
                    break;
                case 4:
                    System.out.print("Please input your number: ");
                    int number = scanner.nextInt();
                    searchNumber(number, array);
                    break;
                case 5:
                    array = generateArrayList(inputArrayLength());
                    break;
                case 6:
                    isContinuing = false;
                    break;
                default:
                    System.out.println("Invalid number option");
                    break;
            }
        }
    }

    private static int inputArrayLength() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;
        while(true) {
            System.out.print("Please input the length of the array: ");
            length = scanner.nextInt();
            if (length < 1) {
                System.out.println("Invalid number");
            } else {
                break;
            }
        }
        return length;
    }

    private static List generateArrayList(int length) {
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            array.add(new SecureRandom().nextInt(1000));
        }
        return array;

    }

    private static void showMenu() {
        System.out.println("--------------MENU--------------");
        System.out.println("Press 1 - Print all the numbers");
        System.out.println("Press 2 - Print the Maximum number");
        System.out.println("Press 3 - Print the Minimum number");
        System.out.println("Press 4 - Search the number");
        System.out.println("Press 5 - Generate new array");
        System.out.println("Press 6 - Exit");
    }

    public static int inputOption() {
        System.out.print("Your option: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void printAllNumbers(List<Integer> array) {
        System.out.println("Your all numbers: ");
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");
    }

    private static void printMaximumNumber(List<Integer> array) {
        int maximum = 0;
        for (int element: array) {
            if (element > maximum) {
                maximum = element;
            }
        }
        System.out.println("The Maximum number is: " + maximum);
    }

    private static void printMinimumNumber(List<Integer> array) {
        int minimum = array.get(0);
        for (int element: array) {
            if (element < minimum) {
                minimum = element;
            }
        }
        System.out.println("The Minimum number is: " + minimum);
    }

    private static void searchNumber(int number, List<Integer> array) {
        List<Integer> newArray = new ArrayList<>();
        for (int index = 0; index < array.size(); index++) {
            if (number == array.get(index)) {
                newArray.add(index);
            }
        }

        if (newArray.size() > 0){
            for (int element : newArray) {
                System.out.println("Your number " + number + " ís existing in the array and the index is: " + (element + 1));
            }
        } else {
            System.out.println("Your number " + number + " is not in the list");
        }
    }
}
