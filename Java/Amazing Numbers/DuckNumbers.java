package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write your code here
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();

        if (inputInt > 0) {
            boolean ifNumIsEven = inputInt % 2 == 0;
            boolean ifBuzz = ifBuzz(inputInt);
            boolean ifDuck = ifDuck(inputInt);

            System.out.printf("Properties of %d\n", inputInt);
            System.out.printf("\teven:\t%b\n", ifNumIsEven);
            System.out.printf("\todd:\t%b\n", !ifNumIsEven);
            System.out.printf("\tbuzz:\t%b\n", ifBuzz);
            System.out.printf("\tduck:\t%b\n", ifDuck);
        } else {
            System.out.println("This number is not natural!");
        }
    }

    private static boolean ifBuzz(int input) {
        if (input % 7 == 0) {
            return true;
        } else return input % 10 == 7;
    }

    private static boolean ifDuck(int input) {
        for (int i = 10; i <= input; input /= 10) {
            if (input % i == 0) {
                return true;
            }
        }
        return false;
    }
}
