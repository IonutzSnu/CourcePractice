package homework.lesson5;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");

        double length1 = sc.nextDouble();
        System.out.println("Enter the width of Rectangle:");

        double width1 = sc.nextDouble();
        double area1 = length1 * width1;
        System.out.println("Area of Rectangle is:" + area1);

        double length2 = sc.nextDouble();
        System.out.println("Enter the width of Rectangle:");

        double width2 = sc.nextDouble();
        double area2 = length2 * width2;
        System.out.println("Area of Rectangle is:" + area2);

        if (area1 > area2) {
            System.out.println("Primul dreptunghi are aria mai mare decit la al doilea!");

        } else if (area2 > area1) {
            System.out.println("Al doilea dreptunghi are aria mai mare decit la primul!");
            
        } else if (area1 == area2) {
            System.out.println("Ariile dreptunghiurilor sunt egale)!");
        }
    }
}
