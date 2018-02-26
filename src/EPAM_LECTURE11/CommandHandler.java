package EPAM_LECTURE11;

public interface CommandHandler {
        void Handle(CommandContextProcessor context, String commandName, String[] arguments);
}
