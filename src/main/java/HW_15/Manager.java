package HW_15;

public class Manager extends Employee {

//    Необходимо создать класс Manager с полями: имя, возраст, пол,
//    ЗП в день и количество подчиненных. Все поля сделать приватными
//    и для каждого поля добавить методы set и get. Класс должен иметь
//    метод - getSalary(Month[] monthArray), метод возвращает зарплату
//    за те месяцы которые были переданы в качестве аргумента.
//    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

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
        return super.getSalary(monthArray) + super.getSalary(monthArray) / 100 * getNumberOfSubordinates();
    }
}
