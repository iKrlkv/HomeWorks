package HW_17_1;

public interface IManager {

    // поиск наименьшего количества подчиненных в массиве менеджеров
    int getMinNumberOfSubordinates(Manager[] managerArray);

    // поиск наибольшего количества подчиненных в массиве менеджеров
    int getMaxNumberOfSubordinates(Manager[] managerArray);

    // поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров
    int getMaxAllowance(Manager[] managerArray);

}
