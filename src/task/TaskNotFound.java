package task;

public final class TaskNotFound extends TaskImpl {

    public TaskNotFound(String input) {
        super(input);
    }

    @Override
    public void execute() { }

    @Override
    public String getResult() {
        return "ERROR: This task doesn't exist.\n";
    }
}
