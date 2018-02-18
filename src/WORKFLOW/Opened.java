package WORKFLOW;


public class Opened implements State {
    private Task task;

    public Opened (Task task){
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
