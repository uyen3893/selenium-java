package lab_03;

import java.util.Scanner;

public class Lab_303 {

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

            //Sort an integer array from min to max
            int temp = 0;
            for (int index = 0; index < array.length; index++) {
                for (int otherIndex = index + 1; otherIndex < array.length; otherIndex++) {
                    if (array[index] > array[otherIndex]) {
                        temp = array[index];
                        array[index] = array[otherIndex];
                        array[otherIndex] = temp;
                    }
                }
            }

            //print each value of the array
            System.out.println("The new array: ");
            for (int element: array) {
                System.out.print(element + ", ");
            }
            break;
        }
    }
}
