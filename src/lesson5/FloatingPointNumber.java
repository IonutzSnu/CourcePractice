package lesson5;

import java.util.Scanner;

public class FloatingPointNumber {
    public static void main(String[] args) {
        Scanner put = new Scanner(System.in);

        int num;
        System.out.println("Intruduce-ti numarul : ");
        num = put.nextInt();

        if(num>0) {
            System.out.println("Numar pozitiv");
        }
        else if(num<0){
            System.out.println("Numar negativ");
        }
        else{
            System.out.println("Zero");
        }
        if(num<1){
            System.out.println("Numar mic");
        }
        else if(num>1000000){
            System.out.println("Numar mare");
        }

    }
}
