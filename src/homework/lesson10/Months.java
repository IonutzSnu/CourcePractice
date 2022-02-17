package homework.lesson10;

public enum Months {
    JAN, FEB, MAR, APR, MAY, JUN,
    JUL, AUG, SEP, OCT, NOV, DEC;

    public static void main(String[] args) {

        System.out.println("Months of year are:");

        for (Months month_name : Months.values())

            System.out.println(month_name);
    }
}
