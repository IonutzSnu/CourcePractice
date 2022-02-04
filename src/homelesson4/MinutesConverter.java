package homelesson4;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.print("Imput the number of minutes: ");
        double min = input.nextDouble();

        long minutes = 6437826L;
        double days = min / 1440;
        double years = min / 525600;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days ");
    }
}
