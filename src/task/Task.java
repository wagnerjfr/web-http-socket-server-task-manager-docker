package task;

public interface Task {

    String getInput();

    void execute();

    void setExecutedTime(String executedTime);

    String getResult();
}
