package parser.stax;

import model.Medicine;
import model.Package;
import model.Certificate;
import model.Dosage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;

public class StaxReader {
    public static List<Medicine> parseMedicines(File xml, File xsd){
        List<Medicine> medicineList = new LinkedList<Medicine>();
        Medicine medicine = null;
        Certificate certificate = null;
        Package aPackage = null;
        Dosage dosage = null;

        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(xml));
            while(xmlEventReader.hasNext()){
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()){
                    StartElement startElement = xmlEvent.asStartElement();
                    String name = startElement.getName().getLocalPart();
                    switch (name) {
                        case "medicine":
                            medicine = new Medicine();
                            break;
                        case "name":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert medicine != null;
                            medicine.setName(xmlEvent.asCharacters().getData());
                            break;
                        case "pharm":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert medicine != null;
                            medicine.setPharm(xmlEvent.asCharacters().getData());
                            break;
                        case "group":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert medicine != null;
                            medicine.setGroup(xmlEvent.asCharacters().getData());
                            break;
                        case "analog":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert medicine != null;
                            medicine.getAnalogs().add(xmlEvent.asCharacters().getData());
                            break;
                        case "version":
                            xmlEvent = xmlEventReader.nextEvent();
                            medicine.getVersions().add(xmlEvent.asCharacters().getData());
                            break;
                        case "certificate":
                            xmlEvent = xmlEventReader.nextEvent();
                            certificate = new Certificate();
                            break;
                        case "id":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert certificate != null;
                            certificate.setId(Integer.parseInt(xmlEvent.asCharacters().getData()));
                            break;
                        case "issue_date":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert certificate != null;
                            certificate.setIssueDate(xmlEvent.asCharacters().getData());
                            break;
                        case "end_date":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert certificate != null;
                            certificate.setEndDate(xmlEvent.asCharacters().getData());
                            break;
                        case "organization":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert certificate != null;
                            certificate.setOrganization(xmlEvent.asCharacters().getData());
                            break;
                        case "package":
                            xmlEvent = xmlEventReader.nextEvent();
                            aPackage = new Package();
                            break;
                        case "type":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert aPackage != null;
                            aPackage.setType(xmlEvent.asCharacters().getData());
                            break;
                        case "quantity":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert aPackage != null;
                            aPackage.setQuantity(Integer.parseInt(xmlEvent.asCharacters().getData()));
                            break;
                        case "price":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert aPackage != null;
                            aPackage.setPrice(Double.parseDouble(xmlEvent.asCharacters().getData()));
                            break;
                        case "dosage":
                            xmlEvent = xmlEventReader.nextEvent();
                            dosage = new Dosage();
                            break;
                        case "dose":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert dosage != null;
                            dosage.setDose(Double.parseDouble(xmlEvent.asCharacters().getData()));
                            break;
                        case "period":
                            xmlEvent = xmlEventReader.nextEvent();
                            assert dosage != null;
                            dosage.setPeriod(xmlEvent.asCharacters().getData());
                            assert certificate != null;
                            assert aPackage != null;
                            assert dosage != null;
                            assert medicine != null;
                            medicine.setCertificate(certificate);
                            medicine.setaPackage(aPackage);
                            medicine.setDosage(dosage);
                            break;
                    }
                }

                if(xmlEvent.isEndElement()){
                    EndElement endElement = xmlEvent.asEndElement();
                    if(endElement.getName().getLocalPart().equals("medicine")){
                        medicineList.add(medicine);
                    }
                }
            }

        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
        return medicineList;
    }
}
