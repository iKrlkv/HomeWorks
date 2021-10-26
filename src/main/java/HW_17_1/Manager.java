package HW_17_1;

public final class Manager extends BaseEmployee {

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int getDailyRate) {
        super(name, age, gender, getDailyRate);
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        if (numberOfSubordinates == 0) {
            return super.getSalary(monthArray);
        } else {
            return super.getSalary(monthArray) + super.getSalary(monthArray) / 100 * numberOfSubordinates * 3;
        }
    }
}
