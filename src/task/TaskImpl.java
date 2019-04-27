package task;

public abstract class TaskImpl implements Task {

    protected String input;
    protected String result;
    protected String executedTime;

    public TaskImpl(String input) {
        this.input = input;
    }

    @Override
    public String getInput() {
        return input;
    }

    @Override
    public String getResult() {
        return "Result: " + result + "; Executed in: " + executedTime + "\n";
    }

    @Override
    public void setExecutedTime(String executedTime) {
        this.executedTime = executedTime;
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "-> Params: " + input + "; " + this.getResult();
    }
}
