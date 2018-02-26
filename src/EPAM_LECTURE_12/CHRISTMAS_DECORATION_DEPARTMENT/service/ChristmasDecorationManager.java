package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.service;

import EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model.ChristmasDecoration;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ChristmasDecorationManager {
    private static List<ChristmasDecoration> christmasDecorations = new LinkedList<>();

    public static List<ChristmasDecoration> getSortedDecorations () {
        Collections.sort(christmasDecorations,new ChristmasTreeComparator());
        return christmasDecorations;
    }

    public static List<ChristmasDecoration> getGroupedDecorations (List<String> decorationTypes) {
        List<ChristmasDecoration> christmasGroupedDecorations = new LinkedList<>();
        for (ChristmasDecoration christmasDecoration : christmasDecorations) {
            if(decorationTypes.contains(christmasDecoration.getDecorationType())){
                christmasGroupedDecorations.add(christmasDecoration);
            }
        }
        Collections.sort(christmasGroupedDecorations,new ChristmasTreeComparator());
        return christmasGroupedDecorations;
    }

    public static void addDecoration(ChristmasDecoration decoration){
        christmasDecorations.add(decoration);
    }
}
