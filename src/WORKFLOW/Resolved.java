package WORKFLOW;


public class Resolved implements State{
    private Task task;

    public Resolved (Task task){
        this.task = task;
    }
    public void close(){
        task.setState(new Closed(task));
        System.out.println("Succesfully closed");
    }
    public void reopen(){
        task.setState(new Reopened(task));
        System.out.println("Succesfully reopened");
    }
}
