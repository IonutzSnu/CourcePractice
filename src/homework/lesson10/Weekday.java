package homework.lesson10;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {

        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoligay() {

        return this == SATURDAY || this == SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println(Weekday.FRIDAY.isWeekDay());
        System.out.println(Weekday.FRIDAY.isHoligay());
        System.out.println(Weekday.SUNDAY.isHoligay());
        System.out.println(Weekday.SUNDAY.isWeekDay());
    }
}





