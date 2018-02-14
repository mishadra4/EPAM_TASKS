package model;


public class Certificate {
    private int id;
    private String issueDate;
    private String endDate;
    private String organization;

    public Certificate(int id, String issueDate, String endDate, String organization) {
        this.id = id;
        this.issueDate = issueDate;
        this.endDate = endDate;
        this.organization = organization;
    }

    public Certificate() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}

