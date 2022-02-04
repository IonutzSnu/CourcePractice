package lesson5;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        System.out.println("Introduce-ti numarul:");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if((n%2)==0){
            System.out.println("Cifra " + n + " este para. ");
        }
        else{
            System.out.println("Cifra " + n + " este impara. ");
        }
    }
}
