package HW_17_1;

public abstract class Employee extends BaseEmployee implements IEmployee {

    public Employee(String name, int age, char gender, int dailyRate) {
        super(name, age, gender, dailyRate);
    }

    public abstract int getSalary(Month[] monthArray);

    public abstract int getBaseSalary(Month[] monthArray);
}
