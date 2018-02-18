package WORKFLOW;


public class Reopened implements State {
    private Task task;

    public Reopened (Task task){
        this.task = task;
    }

    public void resolve(){
        task.setState(new Resolved(task));
        System.out.println("Succesfully resolved");
    }
    public void assign(){
        task.setAssigned(true);
        System.out.println("Succesfully assigned");
    }
}
