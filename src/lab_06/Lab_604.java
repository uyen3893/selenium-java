package lab_06;

import java.util.Scanner;

public class Lab_604 {
    public static void main(String[] args) {
        String url = inputString();
        String[] keywords = new String[]{"http", "https",".com", ".net", "google"};
        for (String keyword: keywords) {
            if (check(keyword, url)) {
                System.out.println(keyword + " is belong to the url");
            } else {
                System.out.println(keyword + " is not belong to the url");
            }
        }
    }

    public static boolean check (String keyword, String url) {
        if (url.contains(keyword)) {
            return true;
        } else {
            return false;
        }
    }

    public static String inputString () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your string: ");
        return scanner.nextLine().trim();
    }
}
