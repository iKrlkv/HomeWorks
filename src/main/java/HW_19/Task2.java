package HW_19;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 100; i <= 1000; i += 100) {
            list.add(i);
        }
        System.out.println(list);
    }
}
