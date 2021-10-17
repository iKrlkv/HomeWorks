package HW_15;

public class Month {

    // Создать класс Month с полями: имя месяца, количеством дней
    // и количеством рабочих дней. Создать класс MonthUtils,
    // который бы хранил подготовленные месяцы или их массивы
    // для использования (объекты класса Month).

    // Два варианта - или создаем такой вспомогательный nested-class внутри основного класса month
    // или создаем обычный вспомогательный класс MonthUtils
    public static class MonthUtils {

        public static final Month JANUARY = new Month("January", 31, 15);
        public static final Month FEBRUARY = new Month("February", 28, 19);
        public static final Month MARCH = new Month("March", 31, 22);
        public static final Month APRIL = new Month("April", 30, 22);
        public static final Month MAY = new Month("May", 31, 19);
        public static final Month JUNE = new Month("June", 30, 21);
        public static final Month JULY = new Month("July", 31, 22);
        public static final Month AUGUST = new Month("August", 31, 22);
        public static final Month SEPTEMBER = new Month("September", 30, 22);
        public static final Month OCTOBER = new Month("October", 31, 21);
        public static final Month NOVEMBER = new Month("November", 30, 20);
        public static final Month DECEMBER = new Month("December", 31, 22);

        public static final Month[] YEAR = new Month[] {
                JANUARY, FEBRUARY,
                MARCH, APRIL, MAY,
                JUNE, JULY, AUGUST,
                SEPTEMBER, OCTOBER,
                NOVEMBER, DECEMBER
        };
    }

    private final String nameOfMonth;
    private final int daysInMonth;
    private final int workingDaysInMonth;

    public Month(String nameOfMonth, int daysInMonth, int workingDaysInMonth) {
        this.nameOfMonth = nameOfMonth;
        this.daysInMonth = daysInMonth;
        this.workingDaysInMonth = workingDaysInMonth;
    }

    public String getNameOfMonth() {
        return nameOfMonth;
    }

    public int getDaysInMonth() {
        return daysInMonth;
    }

    public int getWorkingDaysInMonth() {
        return workingDaysInMonth;
    }
}
