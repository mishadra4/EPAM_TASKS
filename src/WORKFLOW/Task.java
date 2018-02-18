package WORKFLOW;


public class Task {
    private boolean assigned;
    private State state;

    public Task(){
        this.assigned = false;
        this.state = new Opened(this);
    }

    public void close(){
        state.close();
    }
    public void open(){
        state.open();
    }
    public void resolve(){
        state.resolve();
    }
    public void reopen(){
        state.reopen();
    }

    public boolean isAssigned() {
        return assigned;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
