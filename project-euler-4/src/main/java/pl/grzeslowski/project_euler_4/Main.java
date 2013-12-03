package pl.grzeslowski.project_euler_4;

public class Main {

    public static void main(final String[] args) {
        final int endNumber = Integer.parseInt(args[0]);
        
        final ProjectEuler4MathWay projectEuler4MathWay = new ProjectEuler4MathWay();

        System.out.println(projectEuler4MathWay.getDifference(endNumber));
    }

}
