package lab_03;

import java.util.Scanner;

public class Lab_304 {

    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            int[] firstArray;
            int[] secondArray;
            int[] newArray;

            //Input values of the first array
            System.out.print("Please input your first array\'s length: ");
            int firstArrayLength = scanner.nextInt();

            if (firstArrayLength < 1) {
                System.out.print("Invalid value");
                break;
            }

            firstArray = new int[firstArrayLength];
            for (int index = 0; index < firstArrayLength; index++) {
                System.out.print("Please input your " + (index + 1) + " value in the first array: ");
                firstArray[index] = scanner.nextInt();
            }

            //sort the first array
            for (int index = 0; index < firstArray.length; index++) {
                for (int otherIndex = index + 1; otherIndex < firstArray.length; otherIndex++) {
                    int temp = 0;
                    if (firstArray[index] > firstArray[otherIndex]) {
                        temp = firstArray[index];
                        firstArray[index] = firstArray[otherIndex];
                        firstArray[otherIndex] = temp;
                    }
                }
            }

            //Input values of the second array
            System.out.print("Please input your second array\'s length: ");
            int secondArrayLength = scanner.nextInt();

            if (secondArrayLength < 1) {
                System.out.print("Invalid value");
                break;
            }

            secondArray = new int[secondArrayLength];
            for (int index = 0; index < secondArrayLength; index++) {
                System.out.print("Please input your " + (index + 1) + " value in the second array: ");
                secondArray[index] = scanner.nextInt();
            }

            //sort the second array
            for (int index = 0; index < secondArray.length; index++) {
                for (int otherIndex = index + 1; otherIndex < secondArray.length; otherIndex++) {
                    int temp = 0;
                    if (secondArray[index] > secondArray[otherIndex]) {
                        temp = secondArray[index];
                        secondArray[index] = secondArray[otherIndex];
                        secondArray[otherIndex] = temp;
                    }
                }
            }

            //merge the new array from the first and the second array
            newArray = new int[firstArrayLength + secondArrayLength];
            for (int index = 0; index < newArray.length; index++) {
                if (index < firstArrayLength) {
                    newArray[index] = firstArray[index];
                } else {
                    newArray[index] = secondArray[newArray.length - index - 1];
                }
            }

            //sort the new array
            for (int index = 0; index < newArray.length; index++) {
                for (int otherIndex = index + 1; otherIndex < newArray.length; otherIndex++) {
                    int temp = 0;
                    if (newArray[index] > newArray[otherIndex]) {
                        temp = newArray[index];
                        newArray[index] = newArray[otherIndex];
                        newArray[otherIndex] = temp;
                    }
                }
            }

            //Print the new array's values
            System.out.print("New array: ");
            for(int each: newArray) {
                System.out.print(each + ", ");
            }
            break;
        }
    }
}
