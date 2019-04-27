package singleton;

import task.*;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum TaskExecutor {

    //Singleton
    INSTANCE;

    public String run(String parameters) {
        Task task;

        List<String> list = Arrays.stream(parameters.split("&")).collect(Collectors.toList());

        long start = System.currentTimeMillis();
        if (list.size() != 2) {
            task = new TaskIncorrectParams("");
        } else {
            String taskName = list.get(0);
            String input = list.get(1);

            switch (taskName) {
                case "TaskBubbleSort":
                    task = new TaskBubbleSort(input);
                    break;
                case "TaskFiboRecursive":
                    task = new TaskFiboRecursive(input);
                    break;
                case "TaskBitcoin":
                    task = new TaskBitcoin(input);
                    break;
                default:
                    task = new TaskNotFound("");
                    break;
            }
            task.execute();
        }

        TasksList.INSTANCE.add(task);
        long end = System.currentTimeMillis();
        String executedTime = new DecimalFormat("#0.00").format((end - start) / 1000d) + "s";
        task.setExecutedTime(executedTime);

        return task.getResult();
    }
}
