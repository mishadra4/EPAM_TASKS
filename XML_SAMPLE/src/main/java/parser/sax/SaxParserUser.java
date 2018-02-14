package parser.sax;

import model.Medicine;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class SaxParserUser {
    private static SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

    public static List<Medicine> parseMedicines(File xml, File xsd) {
        List<Medicine> medicineList = new LinkedList<>();
        try {
            saxParserFactory.setSchema(SaxValidator.createSchema(xsd));

            SAXParser saxParser = saxParserFactory.newSAXParser();
            SaxHandler saxHandler = new SaxHandler();
            saxParser.parse(xml, saxHandler);

            medicineList = saxHandler.getMedicineList();
        } catch (SAXException | ParserConfigurationException | IOException ex) {
            ex.printStackTrace();
        }

        return medicineList;
    }
}
