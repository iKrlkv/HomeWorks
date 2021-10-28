package HW_17_1;

public class MonthUtils {

    public static class Month {

        private final String name;
        private final int daysInMonth;
        private final int workingDays;

        public Month(String name, int daysInMonth, int workingDays) {
            this.name = name;
            this.daysInMonth = daysInMonth;
            this.workingDays = workingDays;
        }

        public String getName() {
            return name;
        }

        public int getDaysInMonth() {
            return daysInMonth;
        }

        public int getWorkingDays() {
            return workingDays;
        }
    }

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

    public static final Month[] FirstQuarter = new Month[] {
            JANUARY, FEBRUARY, MARCH
    };

    public static final Month[] SecondQuarter = new Month[] {
            APRIL, MAY, JUNE
    };

    public static final Month[] ThirdQuarter = new Month[] {
            JULY, AUGUST, SEPTEMBER
    };

    public static final Month[] FourthQuarter = new Month[] {
            OCTOBER, NOVEMBER, DECEMBER
    };

    public static final Month[] FirstHalfOfTheYear = new Month[] {
            JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE
    };

    public static final Month[] SecondHalfOfTheYear = new Month[] {
            JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER
    };

    public static final Month[] YEAR = new Month[] {
            JANUARY, FEBRUARY,
            MARCH, APRIL, MAY,
            JUNE, JULY, AUGUST,
            SEPTEMBER, OCTOBER,
            NOVEMBER, DECEMBER
    };
}
