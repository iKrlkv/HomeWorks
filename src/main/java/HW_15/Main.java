package HW_15;

public class Main {

    public static void main(String[] args) {

        Employee employee = new Employee("Ivan", 25, 'M', 300);

        Manager manager = new Manager("Vasya", 30, 'M', 500, 10);

        System.out.println(employee.getSalary(Month.MonthUtils.YEAR));
        System.out.println(manager.getSalary(Month.MonthUtils.YEAR));
    }
}
