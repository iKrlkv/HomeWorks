package HW_17_1;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private int dailyRate;

    public BaseEmployee(String name, int age, char gender, int dailyRate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailyRate = dailyRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;

        for (int i = 0; i < monthArray.length; i++) {
            salary += dailyRate * monthArray[i].getWorkingDays();
        }
        return salary;
    }

    public int getSalary(Month month) {
        return month.getWorkingDays() * dailyRate;
    }

    public int getBaseSalary(Month[] monthArray) {
        return this.getSalary(monthArray);
    }

    public int getBaseSalary(Month month) {
        return this.getSalary(month);
    }
}