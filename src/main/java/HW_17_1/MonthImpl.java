package HW_17_1;

public class MonthImpl implements Month {

    private final String name;
    private final int daysInMonth;
    private final int workingDays;

    public MonthImpl(String name, int daysInMonth, int workingDays) {
        this.name = name;
        this.daysInMonth = daysInMonth;
        this.workingDays = workingDays;
    }


}
