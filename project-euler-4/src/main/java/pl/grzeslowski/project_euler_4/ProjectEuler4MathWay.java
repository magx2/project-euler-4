package pl.grzeslowski.project_euler_4;

public class ProjectEuler4MathWay implements ProjectEuler4 {

    public long getDifference(final int endNumber) {
        long value = 0;

        for (int i = 1; i <= endNumber; i++) {
            for (int k = i + 1; k <= endNumber; k++) {
                value += 2 * i * k;
            }
        }

        return value;
    }

}
