package task;

public class TaskFiboRecursive extends TaskImpl {

    public TaskFiboRecursive(String input) {
        super(input);
    }

    @Override
    public void execute() {
        String[] stringArray = input.split(",");
        // just one number is expected
        int n = Integer.valueOf(stringArray[0]);
        result = String.valueOf(fibonacci(n));
    }

    /**
     * Recursive Fibonacci function
     * @param n
     * @return int
     */
    private int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
