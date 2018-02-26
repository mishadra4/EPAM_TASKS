package EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT;


import EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.model.*;
import EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.service.ChristmasDecorationManager;
import EPAM_LECTURE_12.CHRISTMAS_DECORATION_DEPARTMENT.service.ChristmasTreeComparator;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> decorationTypes = new LinkedList<>();
        List<ChristmasDecoration> christmasDecorations = new LinkedList<>();

        ChristmasDecorationManager.addDecoration(new Angel(5.99));
        ChristmasDecorationManager.addDecoration(new ChristmasFlag(12.49));
        ChristmasDecorationManager.addDecoration(new ChristmasStocking(10.99));
        ChristmasDecorationManager.addDecoration(new HouseLights(12.49));
        ChristmasDecorationManager.addDecoration(new ChristmasTreeLights(9.99));
        ChristmasDecorationManager.addDecoration(new Ribbon(7.99));
        ChristmasDecorationManager.addDecoration(new Star(4.49));

        decorationTypes.add("Christmas_tree");
        decorationTypes.add("Flat");
        decorationTypes.add("House");

        christmasDecorations = ChristmasDecorationManager.getGroupedDecorations(decorationTypes);

        for (ChristmasDecoration christmasDecoration: christmasDecorations) {
            System.out.println(christmasDecoration);
        }
    }

}
