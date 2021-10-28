package HW_17_1;

public class Worker extends BaseEmployee {

    public Worker(String name, int age, char gender, int dailyRate) {
        super(name, age, gender, dailyRate);
    }

    public final int getBaseSalary(Month[] monthArray) {
        return super.getSalary(monthArray);
    }
}
