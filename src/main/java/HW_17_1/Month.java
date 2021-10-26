package HW_17_1;

public final class Month {

    private final String name;
    private final int daysInMonth;
    private final int workingDays;

    Month(String name, int daysInMonth, int workingDays) {
        this.name= name;
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
