package parser.dom;

/**
 * Created by User on 13-Feb-18.
 */

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DomDocCreator {
    private DocumentBuilderFactory builderFactory;
    private DocumentBuilder documentBuilder;
    private Document document;

    public DomDocCreator(File xml) {
        createDOMBuilder();
        createDoc(xml);
    }

    private void createDOMBuilder(){
        builderFactory = DocumentBuilderFactory.newInstance();
        try {
            documentBuilder = builderFactory.newDocumentBuilder();
        }catch (ParserConfigurationException ex){
            ex.printStackTrace();
        }
    }

    private void createDoc(File xml){
        try {
            document = documentBuilder.parse(xml);
        }catch (SAXException | IOException ex){
            ex.printStackTrace();
        }
    }

    public Document getDocument() {
        return document;
    }
}
