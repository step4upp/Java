package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write your code here
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");
        System.out.println("Enter a request:");

        Scanner scanner = new Scanner(System.in);

        long inputInt = scanner.nextLong();

        while (inputInt != 0) {
            if (inputInt > 0) {
                boolean ifNumIsEven = inputInt % 2 == 0;
                boolean ifBuzz = ifBuzz(inputInt);
                boolean ifDuck = ifDuck(inputInt);
                boolean ifPalindromic = ifPalindromic(inputInt);

                System.out.printf("Properties of %d\n", inputInt);
                System.out.printf("\teven:\t%b\n", ifNumIsEven);
                System.out.printf("\todd:\t%b\n", !ifNumIsEven);
                System.out.printf("\tbuzz:\t%b\n", ifBuzz);
                System.out.printf("\tduck:\t%b\n", ifDuck);
                System.out.printf("\tpalindromic:\t%b\n", ifPalindromic);
            } else {
                System.out.println("The first parameter should be a natural number or zero.");
            }
            System.out.println("Enter a request:");
            inputInt = scanner.nextLong();
        }
        System.out.println("Goodbye!");
    }

    private static boolean ifBuzz(long input) {
        if (input % 7 == 0) {
            return true;
        } else return input % 10 == 7;
    }

    private static boolean ifDuck(long input) {
        for (int i = 10; i <= input; input /= 10) {
            if (input % i == 0) {
                return true;
            }
        }
        return false;
    }

    private static boolean ifPalindromic(long input) {
        String inputStr = String.valueOf(input);

        for(int i = 0; i * 2 <= inputStr.length(); i++) {
            if (inputStr.charAt(i) != inputStr.charAt(inputStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
