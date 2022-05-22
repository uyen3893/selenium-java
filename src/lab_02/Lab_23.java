package lab_02;

import java.util.Scanner;

public class Lab_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your weight(kg): ");
        float weight = scanner.nextFloat();
        System.out.println("Please input your height(cm): ");
        float height = scanner.nextFloat();
        float BMI = weight/(height*2) * 100;
        if (BMI < 18.5) {
            System.out.printf("You should gain more %f kg.", (18.5 - BMI) / 100 * (height * 2));
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.printf("You have a great body.");
        } else if (BMI > 24.9 && BMI < 30) {
            System.out.printf("To have a great body you need to lose %f kg", (BMI - 24.9) / 100 * (height * 2));
        } else {
            System.out.printf("Warning! You need to lose %f kg", (BMI - 24.9) /100 * (height * 2));
        }
    }
}
