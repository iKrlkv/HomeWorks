package HW_17_1;

public final class Director extends BaseEmployee {

    public static final int DIRECTOR_COEFFICIENT = 9;

    private final int numberOfSubordinates;

    public Director(String name, int age, char gender, int dailyRate, int numberOfSubordinates) {
        super(name, age, gender, dailyRate);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {

        if (numberOfSubordinates == 0) {
            return super.getSalary(monthArray);
        } else {
            return super.getSalary(monthArray) + super.getSalary(monthArray) / 100 * numberOfSubordinates * DIRECTOR_COEFFICIENT;
        }
    }
}
