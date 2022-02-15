package homework.lesson9;


import javafx.scene.input.InputMethodTextRun;

import java.util.Scanner;

public class TryToPin {
    public static void main(String[] args) {
        final String PASSWORD = "1234";

        for (int passAttempts = 0; passAttempts < 3; passAttempts++) {
            System.out.print("\nEnter Your Password: ");
            Scanner input = new Scanner(System.in);
            String inputPass = input.nextLine();

            if (inputPass.equals(PASSWORD)) {
                System.out.println("\nCorrect, welcome back!");
                break;
            } else {
                if (!(inputPass.equals(PASSWORD))) {
                    System.out.println("\nWrong Password Try Again");
                }
                }
            if (passAttempts>=2){
                System.out.println("\nSorry but you have been locked out!");
            }
        }
    }
}