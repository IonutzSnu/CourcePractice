package homework.lesson6;

import java.util.Scanner;

public class MaxMinTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double maxTemp = 45.3;
        double minTemp = -32.3;
        double temperature = scanner.nextDouble();
        scanner.close();

        if (temperature > maxTemp) {
            System.out.println("Porridge is too hot.");
        } else
            if (temperature < minTemp) {
                System.out.println("Porridge is too cold.");
            } else {
                System.out.println("Porridge is just right.");
            }
        }
    }
