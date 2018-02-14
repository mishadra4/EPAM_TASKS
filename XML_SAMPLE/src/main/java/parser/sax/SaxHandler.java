package parser.sax;


import model.Medicine;
import model.Dosage;
import model.Package;
import model.Certificate;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SaxHandler extends DefaultHandler {
    List<Medicine> medicineList = new LinkedList<Medicine>();
    Medicine medicine = null;
    Certificate certificate = null;
    Package aPackage = null;
    Dosage dosage = null;


    private boolean bName = false;
    private boolean bPharm = false;
    private boolean bGroup = false;
    private boolean bAnalogs = false;
    private boolean bAnalog = false;
    private boolean bVersions = false;
    private boolean bVersion = false;
    private boolean bCertificate = false;
    private boolean bId = false;
    private boolean bIssue_date = false;
    private boolean bEndDate = false;
    private boolean bOrganization = false;
    private boolean bPackage = false;
    private boolean bType = false;
    private boolean bQuantity = false;
    private boolean bPrice = false;
    private boolean bDosage = false;
    private boolean bDose = false;
    private boolean bPeriod = false;

    public List<Medicine> getMedicineList(){
        return this.medicineList;
    }

    public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("medicine")){
            medicine = new Medicine();
        }
        else if (qName.equalsIgnoreCase("name")){bName = true;}
        else if (qName.equalsIgnoreCase("pharm")){bPharm = true;}
        else if (qName.equalsIgnoreCase("group")){bGroup = true;}
        else if (qName.equalsIgnoreCase("analogs")){bAnalogs = true;}
        else if (qName.equalsIgnoreCase("analog")){bAnalog = true;}
        else if (qName.equalsIgnoreCase("versions")){bVersions = true;}
        else if (qName.equalsIgnoreCase("version")){bVersion = true;}
        else if (qName.equalsIgnoreCase("certificate")){bCertificate = true;}
        else if (qName.equalsIgnoreCase("id")){bId = true;}
        else if (qName.equalsIgnoreCase("issue_date")){bIssue_date = true;}
        else if (qName.equalsIgnoreCase("end_date")){bEndDate = true;}
        else if (qName.equalsIgnoreCase("organization")){bOrganization = true;}
        else if (qName.equalsIgnoreCase("package")){bPackage = true;}
        else if (qName.equalsIgnoreCase("type")){bType = true;}
        else if (qName.equalsIgnoreCase("quantity")){bQuantity = true;}
        else if (qName.equalsIgnoreCase("price")){bPrice = true;}
        else if (qName.equalsIgnoreCase("dosage")){bDosage = true;}
        else if (qName.equalsIgnoreCase("dose")){bDose = true;}
        else if (qName.equalsIgnoreCase("period")){bPeriod = true;}
    }

    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("medicine")){
            medicineList.add(medicine);
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        if (bName){
            medicine.setName(new String(ch, start, length));
            bName = false;
        }
        else if (bPharm){
            medicine.setPharm(new String(ch, start, length));
            bPharm = false;
        }
        else if (bGroup){
            medicine.setGroup(new String(ch, start, length));
            bGroup = false;
        }
        else if (bAnalog){
            medicine.getAnalogs().add(new String(ch, start, length));
            bAnalog = false;
        }
        else if (bVersion){
            medicine.getVersions().add(new String(ch, start, length));
            bVersion = false;
        }
        else if (bCertificate){
            certificate = new Certificate();
            bCertificate = false;
        }
        else if(bId){
            certificate.setId(Integer.parseInt(new String(ch,start,length)));
            bId = false;
        }
        else if (bIssue_date){
            certificate.setIssueDate(new String(ch,start,length));
            bIssue_date = false;
        }
        else if (bEndDate){
            certificate.setEndDate(new String(ch,start,length));
            bEndDate = false;
        }
        else if (bOrganization){
            certificate.setOrganization(new String(ch,start,length));
            bOrganization = false;
        }
        else if (bPackage){
            aPackage = new Package();
            bPackage = false;
        }
        else if (bType){
            aPackage.setType(new String(ch,start,length));
            bType = false;
        }
        else if (bQuantity){
            aPackage.setQuantity(Integer.parseInt(new String(ch,start,length)));
            bQuantity = false;
        }
        else if(bPrice){
            aPackage.setPrice(Double.parseDouble(new String(ch,start,length)));
            bPrice = false;
        }
        else if (bDosage){
            dosage = new Dosage();
            bDosage = false;
        }
        else if (bDose){
            dosage.setDose(Double.parseDouble(new String(ch,start,length)));
            bDose = false;
        }
        else if (bPeriod){
            dosage.setPeriod(new String(ch,start,length));
            medicine.setCertificate(certificate);
            medicine.setaPackage(aPackage);
            medicine.setDosage(dosage);
            bPeriod = false;
        }
    }
}
