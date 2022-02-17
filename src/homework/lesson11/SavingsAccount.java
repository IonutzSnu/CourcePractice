package homework.lesson11;

public class SavingsAccount {

    static private double anualInterestRate;
    static private double savingBalance;

    public void SavingsAcount() {
    }

    public SavingsAccount(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public double getSavingBalance() {
        return this.savingBalance;
    }

    public static void modifyInterestRate(double newInterestRate) {
        double annualInterestRate = newInterestRate;
    }

    public void calculateMonthlyInterest() {
        double monthlyI;
        double annualInterestRate = 0;
        monthlyI = (double) (this.savingBalance * annualInterestRate / 12);
        this.savingBalance += monthlyI;
    }
}
