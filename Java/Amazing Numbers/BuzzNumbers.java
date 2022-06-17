package numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //write your code here
        System.out.println("Enter a natural number:");
        Scanner scanner = new Scanner(System.in);

        int inputInt = scanner.nextInt();

        boolean ifNumIsEven = inputInt % 2 == 0;
        boolean ifDivBy7 = inputInt % 7 == 0;
        boolean ifLastIs7 = inputInt % 10 == 7;

        if (inputInt <= 0) {
            System.out.println("This number is not natural!");
        }

        if (ifNumIsEven) {
            System.out.println("This number is Even");
        } else {
            System.out.println("This number is Odd");
        }

        if (ifDivBy7 || ifLastIs7) {
            System.out.println("It is a Buzz number.");
            System.out.println("Explanation:");
            System.out.print(inputInt);
        } else {
            System.out.println("It is not a Buzz number");
            System.out.println("Explanation:");
            System.out.printf("%d is neither divisible by 7 nor does it end with 7.", inputInt);
        }

        if (ifDivBy7) {
            System.out.print(" is divisible by 7");
        } else if (ifLastIs7) {
            System.out.print(" ends with 7");
        }

        if (ifLastIs7) {
            System.out.print(" and ends with 7");
        }
    }
}
