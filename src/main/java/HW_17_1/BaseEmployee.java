package HW_17_1;

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char gender;
    private int getDailyRate;

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

    public int getGetDailyRate() {
        return getDailyRate;
    }

    public void setGetDailyRate(int getDailyRate) {
        this.getDailyRate = getDailyRate;
    }

    public int getSalary(Month[] monthArray) {
        int salary = 0;

        for (int i = 0; i < monthArray.length; i++) {
            salary = getDailyRate * monthArray[i].getWorkingDays();
        }
        return salary;
    }
}