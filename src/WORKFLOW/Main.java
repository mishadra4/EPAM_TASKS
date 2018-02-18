package WORKFLOW;


public class Main {
    public static void main(String[] args) {
        Task veryImportantTask = new Task();
        veryImportantTask.close();
        veryImportantTask.resolve();
        veryImportantTask.open();
        veryImportantTask.reopen();
    }
}
