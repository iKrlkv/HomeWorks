package HW_15;

public class Employee {

//    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
//    Все поля сделать приватными и для каждого поля добавить методы set и get.
//    Класс должен иметь метод - getSalary(Month[] monthArray),
//    метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

    private String name;
    private int age;
    private char gender;
    private int dailyRate;

    public Employee(String name, int age, char gender, int dailyRate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailyRate = dailyRate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setDailyRate(int dailyRate) {
        this.dailyRate = dailyRate;
    }

    public int getDailyRate() {
        return dailyRate;
    }

    public int getSalary(Month[] monthArray) {
        int sum = 0;
        if (monthArray != null && monthArray.length != 0) {
            for (int i = 0; i < monthArray.length; i++) {
                sum += monthArray[i].getWorkingDaysInMonth() * getDailyRate();
            }
        }
        return sum;
    }

}
