package programmer.muda.maven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import programmer.muda.maven.resolver.RandomParamaterResolver;

@Extensions({
        @ExtendWith(RandomParamaterResolver.class)
})
public class AbstractCalculatorTest {
    protected Calculator calculator = new Calculator();

    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }
}
