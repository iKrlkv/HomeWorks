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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDaysInMonth() {
        return daysInMonth;
    }

    @Override
    public int getWorkingDays() {
        return workingDays;
    }
}
