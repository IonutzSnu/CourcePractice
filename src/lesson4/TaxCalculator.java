package lesson4;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 3.42;
        double tax = 67.43;
        int quantity = 45;
        double sum = price*quantity*tax;

        System.out.println("Total cost with tax is:" + "\n"  + sum);
    }
}
