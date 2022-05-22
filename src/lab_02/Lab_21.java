package lab_02;

import java.util.Scanner;

public class Lab_21 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight(kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Please input your height(cm): ");
        int height = scanner.nextInt();
        float BMI = weight / (height*2) * 100;
        if (BMI < 18.5){
            System.out.printf("You are underweight. Your BMI is: %f", BMI);
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("You have a great body. Your BMI is: %f", BMI);
        } else if (BMI > 24.9 && BMI <= 29.9) {
            System.out.printf("You are overweight. Your BMI is: %f", BMI);
        } else {
            System.out.printf("Warning!!! You are obese. Your BMI is: %f", BMI);
        }
    }



}
