package parser.dom;

import model.Certificate;
import model.Dosage;
import model.Medicine;
import model.Package;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class DomDocReader {
    public List<Medicine> readDoc(Document doc){
        doc.getDocumentElement().normalize();
        List<Medicine> medicines = new ArrayList<>();

        NodeList nodeList = doc.getElementsByTagName("medicine");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Medicine medicine = new Medicine();
            Certificate certificate;
            Package aPackage;
            Dosage dosage;

            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;

                medicine.setName(element.getElementsByTagName("name").item(0).getTextContent());
                medicine.setPharm(element.getElementsByTagName("pharm").item(0).getTextContent());
                medicine.setGroup(element.getElementsByTagName("group").item(0).getTextContent());
                medicine.getAnalogs().add(element.getElementsByTagName("analog").item(0).getTextContent());
                medicine.getVersions().add(element.getElementsByTagName("version").item(0).getTextContent());


                certificate = getCertificate(element.getElementsByTagName("certificate"));
                aPackage = getPackage(element.getElementsByTagName("package"));
                dosage = getDosage(element.getElementsByTagName("dosage"));


                medicine.setCertificate(certificate);
                medicine.setaPackage(aPackage);
                medicine.setDosage(dosage);
                medicines.add(medicine);
            }
        }
        return medicines;
    }

    private Certificate getCertificate(NodeList nodes){
        Certificate certificate = new Certificate();
        if (nodes.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodes.item(0);
            certificate.setId(Integer.parseInt(element.getElementsByTagName("id").item(0).getTextContent()));
            certificate.setIssueDate(element.getElementsByTagName("issue_date").item(0).getTextContent());
            certificate.setEndDate(element.getElementsByTagName("end_date").item(0).getTextContent());
            certificate.setOrganization(element.getElementsByTagName("organization").item(0).getTextContent());
        }

        return certificate;
    }

    private Package getPackage(NodeList nodes){
        Package aPackage = new Package();
        if (nodes.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodes.item(0);
            aPackage.setType(element.getElementsByTagName("type").item(0).getTextContent());
            aPackage.setQuantity(Integer.parseInt(element.getElementsByTagName("quantity").item(0).getTextContent()));
            aPackage.setPrice(Double.parseDouble(element.getElementsByTagName("price").item(0).getTextContent()));
        }

        return aPackage;
    }

    private Dosage getDosage(NodeList nodes){
        Dosage dosage = new Dosage();
        if (nodes.item(0).getNodeType() == Node.ELEMENT_NODE){
            Element element = (Element) nodes.item(0);
            dosage.setDose(Double.parseDouble(element.getElementsByTagName("dose").item(0).getTextContent()));
            dosage.setPeriod(element.getElementsByTagName("period").item(0).getTextContent());
        }
        return dosage;
    }
}
