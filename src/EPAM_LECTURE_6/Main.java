package EPAM_LECTURE_6;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by User on 17-Jan-18.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 11; i++) {
            list.add(i);
        }
        System.out.println(Algorithm.countIf(list,new OddPredicate()));
    }
}
