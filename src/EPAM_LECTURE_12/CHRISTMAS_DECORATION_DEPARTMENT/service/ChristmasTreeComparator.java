package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.service;

import EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model.ChristmasDecoration;

import java.util.Comparator;


public class ChristmasTreeComparator implements Comparator<ChristmasDecoration> {
    @Override
    public int compare(ChristmasDecoration o1, ChristmasDecoration o2) {
        if(o1 == null || o2 == null){
            throw new IllegalArgumentException("Objects are null");
        }
        return o1.getDecorationType().toString().compareTo(o2.getDecorationType().toString());
    }
}
