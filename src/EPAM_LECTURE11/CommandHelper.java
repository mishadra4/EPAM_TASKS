package EPAM_LECTURE11;


public class CommandHelper implements DefHandler {
    @Override
    public void Process(ContextProcessor context, String line) {
        // first word on the line is the command, all other words are arguments.
        // split the string properly

        // then find the correct command handler and invoke it.
        // take the result and add it to the <code>ContextProcessor</code>
    }
}
