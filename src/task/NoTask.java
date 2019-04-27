package task;

public class NoTask extends TaskImpl {

    public NoTask(String input) {
        super(input);
    }

    @Override
    public void execute() { }

    @Override
    public String getResult() {
        return "This task doesn't exist.\n";
    }
}
