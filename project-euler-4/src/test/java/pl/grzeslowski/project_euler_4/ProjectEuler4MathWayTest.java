package pl.grzeslowski.project_euler_4;

import java.util.Arrays;
import java.util.Collection;

import org.fest.assertions.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class ProjectEuler4MathWayTest {
    private final int in;
    private final long out;

    public ProjectEuler4MathWayTest(final int in, final long out) {
        this.in = in;
        this.out = out;
    }

    @Parameters
    public static Collection<Object[]> data() {
        final Object[][] data = new Object[][] { { 3, 36 - 14L }, { 10, 2640L },
                { 1, 0L }, { 2, 9 - 5L } };
        return Arrays.asList(data);
    }

    @Test
    public void test_normal_parameters() {

        // given
        final ProjectEuler4MathWay euler = new ProjectEuler4MathWay();

        // when
        final long difference = euler.getDifference(in);

        // then
        Assertions.assertThat(difference).isEqualTo(out);
    }
}
