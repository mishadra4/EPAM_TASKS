package WORKFLOW;

public interface State {
    default void open(){
        System.out.println("Opening task is restricted");
    }
    default void resolve(){
        System.out.println("Resolving task is restricted");
    }
    default void reopen(){
        System.out.println("Reopening task is restricted");
    }
    default void close(){
        System.out.println("Closing task is restricted");
    }
    default void assign(){
        System.out.println("Assigning task is restricted");
    }
}
