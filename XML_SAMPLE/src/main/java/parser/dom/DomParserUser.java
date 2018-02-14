package parser.dom;

import model.Medicine;
import org.w3c.dom.Document;

import java.io.File;
import java.util.List;

public class DomParserUser {
    public static List<Medicine> getMedicineList(File xml, File xsd){
        DomDocCreator creator = new DomDocCreator(xml);
        Document doc = creator.getDocument();

        DomDocReader reader = new DomDocReader();

        return reader.readDoc(doc);
    }
}
