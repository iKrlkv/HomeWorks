package HW_17_1;

public final class Manager extends BaseEmployee implements IManager {

    public static final int MANAGER_COEFFICIENT = 3;

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, int dailyRate, int numberOfSubordinates) {
        super(name, age, gender, dailyRate);
        this.numberOfSubordinates = numberOfSubordinates;
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
            return super.getBaseSalary(monthArray);
        } else {
            return super.getBaseSalary(monthArray) + super.getBaseSalary(monthArray) / 100 * numberOfSubordinates * MANAGER_COEFFICIENT;
        }
    }

    @Override
    public int getMinNumberOfSubordinates(Manager[] managerArray) {

        int minNumberOfSubordinates;

        if (managerArray == null) {
            return 0;
        } else if (managerArray.length == 1) {
            return managerArray[0].getNumberOfSubordinates();
        } else {
            minNumberOfSubordinates = managerArray[0].getNumberOfSubordinates();
            for (int i = 1; i < managerArray.length; i++) {
                if (minNumberOfSubordinates > managerArray[i].getNumberOfSubordinates()) {
                    minNumberOfSubordinates = managerArray[i].getNumberOfSubordinates();
                }
            }
            return minNumberOfSubordinates;
        }
    }

    @Override
    public int getMaxNumberOfSubordinates(Manager[] managerArray) {

        int maxNumberOfSubordinates;

        if (managerArray == null) {
            return 0;
        } else if (managerArray.length == 1) {
            return managerArray[0].getNumberOfSubordinates();
        } else {
            maxNumberOfSubordinates = managerArray[0].getNumberOfSubordinates();
            for (int i = 1; i < managerArray.length; i++) {
                if (maxNumberOfSubordinates < managerArray[i].getNumberOfSubordinates()) {
                    maxNumberOfSubordinates = managerArray[i].getNumberOfSubordinates();
                }
            }
            return maxNumberOfSubordinates;
        }
    }

    @Override
    public int getMaxAllowance(Manager[] managerArray) {
        int maxAllowance = 0;

        if (managerArray == null) {
            return 0;
        } else if (managerArray.length == 1) {
            return managerArray[0].getSalary((Month[]) MonthUtils.YEAR) - managerArray[0].getBaseSalary((Month[]) MonthUtils.YEAR);
        }
        return managerArray[0].getBaseSalary((Month[]) MonthUtils.YEAR);
    }
}
