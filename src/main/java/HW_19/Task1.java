package HW_19;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    //Создать лист и добавить в него следующие слова:
    //White.
    //Tan.
    //Yellow.
    //Orange.
    //Red.
    //Pink.
    //Purple.
    //Blue.
    //Затем удалить из этого списка все цвета в которых встречается буква “L”


    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");

        list.removeIf(item -> item.toUpperCase().contains("L"));

        System.out.println(list);
    }




}
