import comparator.MedicineComparator;
import file_checker.ExtensionChecker;
import model.Medicine;
import parser.dom.DomParserUser;
import parser.sax.SaxParserUser;
import parser.sax.SaxValidator;
import parser.stax.StaxReader;

import java.io.File;
import java.util.Collections;
import java.util.List;

public class Parser {
    public static void main(String[] args) {
        File xml = new File("src\\main\\resources\\xml\\medicine.xml");
        File xsd = new File("src\\main\\resources\\xml\\medicine.xsd");

        if (checkIfXML(xml) && checkIfXSD(xsd)) {
//            SAX
            printList(SaxParserUser.parseMedicines(xml, xsd), "SAX");

//            StAX
            printList(StaxReader.parseMedicines(xml, xsd), "StAX");

//            DOM
            printList(DomParserUser.getMedicineList(xml, xsd), "DOM");
        }
    }

    private static boolean checkIfXSD(File xsd) {
        return ExtensionChecker.isXSD(xsd);
    }

    private static boolean checkIfXML(File xml) {
        return ExtensionChecker.isXML(xml);
    }

    private static void printList(List<Medicine> medicines, String parserName) {
        Collections.sort(medicines, new MedicineComparator());
        System.out.println(parserName);
        for (Medicine medicine : medicines) {
            System.out.println(medicine);
        }
    }

}
