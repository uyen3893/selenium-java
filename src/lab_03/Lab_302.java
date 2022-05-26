package lab_03;

import java.util.Scanner;

public class Lab_302 {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);

            //input the length of an array
            System.out.print("Please input the array\'s length: ");
            int length = scanner.nextInt();

            if (length < 1) {
                System.out.println("Invalid value");
                break;
            }

            //declare an array
            int[] array = new int[length];

            //add each value into the array
            for (int index = 0; index < array.length; index++) {
                System.out.print("Please input your " + (index + 1) + " value: ");
                array[index] = scanner.nextInt();
            }

            //caculate the maximum value of the array
            int maximum = 0;
            for (int element: array) {
                if (element > maximum) {
                    maximum = element;
                }
            }
            System.out.println("Maxium: " + maximum);

            //caculate the minimum value of the array
            int minimum = array[0];
            for (int element: array) {
                if (element < minimum) {
                    minimum = element;
                }
            }
            System.out.println("Minium: " + minimum);
        }
    }

}
