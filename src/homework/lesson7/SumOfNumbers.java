package homework.lesson7;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int choise = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("\nEnter first numbers : ");
            int num1 = sc.nextInt();

            System.out.print("\nEnter the second number : ");
            int num2 = sc.nextInt();

            System.out.println("\nSum of " + num1 + "+" + num2 + "=" + (num1 + num2));
            System.out.print("\nTo continue enter_1 : ");
            System.out.println("\nTo stop enter_2 : ");
            choise = sc.nextInt();
        } while (choise == 1);
    }
}
