package model;

import java.util.LinkedList;

/**
 * Created by User on 13-Feb-18.
 */
public class Medicine {
    private String name;
    private String pharm;
    private String group;
    private LinkedList<String> analogs = new LinkedList<>();
    private LinkedList<String> versions = new LinkedList<>();
    private Certificate certificate;
    private Package aPackage;
    private Dosage dosage;

    public Medicine(String name, String pharm, String group,
                    LinkedList<String> analogs, LinkedList<String> versions,
                    Certificate certificate, Package aPackage, Dosage dosage) {
        this.name = name;
        this.pharm = pharm;
        this.group = group;
        this.analogs = analogs;
        this.versions = versions;
        this.certificate = certificate;
        this.aPackage = aPackage;
        this.dosage = dosage;
    }

    public Medicine() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPharm() {
        return pharm;
    }

    public void setPharm(String pharm) {
        this.pharm = pharm;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public LinkedList<String> getAnalogs() {
        return analogs;
    }

    public void setAnalogs(LinkedList<String> analogs) {
        this.analogs = analogs;
    }

    public LinkedList<String> getVersions() {
        return versions;
    }

    public void setVersions(LinkedList<String> versions) {
        this.versions = versions;
    }

    public Certificate getCertificate() {
        return certificate;
    }

    public void setCertificate(Certificate certificate) {
        this.certificate = certificate;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Dosage getDosage() {
        return dosage;
    }

    public void setDosage(Dosage dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "name='" + name + '\'' +
                ", pharm='" + pharm + '\'' +
                ", group='" + group + '\'' +
                ", analogs=" + analogs +
                ", versions=" + versions +
                ", certificate=" + certificate +
                ", aPackage=" + aPackage +
                ", dosage=" + dosage +
                '}';
    }
}
