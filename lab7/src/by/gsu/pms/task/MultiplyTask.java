package by.gsu.pms.task;

public class MultiplyTask implements Task {

    private int max;

    public MultiplyTask(int max) {
        this.max = max;
    }

    @Override
    public double calculate() {
        double result = 0;
        for (int i = 2; i <= max; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    result += i;
                }
            }
        return result;
    }
}
