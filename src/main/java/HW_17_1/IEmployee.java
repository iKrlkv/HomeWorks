package HW_17_1;

public interface IEmployee {

    // поиск сотрудника в массиве по его имени
    Employee getEmployeeByName(String name);

    // поиск сотрудника в массиве по вхождению указанной строки в его имени
    Employee getEmployeeByPartOfName(String partOfName);

    // подсчет зарплатного бюджета для всех сотрудников в массиве
    int getWageFund(Employee[] employeeArray);

    // поиск наименьшей зарплаты в массиве
    int getMinSalary(Employee[] employeeArray);

    // поиск наибольшей зарплаты в массиве
    int getMaxSalary(Employee[] employeeArray);
}
