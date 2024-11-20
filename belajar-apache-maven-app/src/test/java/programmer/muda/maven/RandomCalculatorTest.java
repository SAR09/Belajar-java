package programmer.muda.maven;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest{

    @Test
    public void testRandom(TestInfo info, Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    public void testRandomRepeat(TestInfo info, Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test random calculator")
    @RepeatedTest(value = 10, name = "{displayName}")
    public void testRandomRepeatInfo(TestInfo info, Random random, RepetitionInfo repetitionInfo){
        System.out.println(info.getDisplayName() + " ke" + repetitionInfo.getCurrentRepetition() + " dari" + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a,b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} dengan paramater {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,54,34})
    public void testWithParamater(int value){
        var expexted = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expexted, result);
    }

    public static List<Integer> parameterSource(){
        return List.of(1,2,3,43,44,54);

    }

    @DisplayName("Test calculator")
    @ParameterizedTest(name = "{displayName} dengan paramater {0}")
    @MethodSource({"parameterSource"})
    public void testWithMethodSource(Integer value){
        var expexted = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expexted, result);
    }
}
