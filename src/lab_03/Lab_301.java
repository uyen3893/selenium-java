package lab_03;

import java.util.Scanner;

public class Lab_301 {

    public static void main(String[] args) {
        while(true){
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

            //count the odd and the even number(s) in an integer array
            int totalNumberOdd = 0;
            int totalNumberEven = 0;
            for (int element: array) {
                if (element % 2 == 0) {
                    totalNumberEven++;
                } else {
                    totalNumberOdd++;
                }
            }
            System.out.println("Even numbers: " + totalNumberEven);
            System.out.println("Odd numbers: " + totalNumberOdd);
            break;
        }
    }

}
