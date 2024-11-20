package programmer.muda.maven;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import programmer.muda.maven.generator.SimpleDisplayNameGenarator;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayNameGeneration(SimpleDisplayNameGenarator.class)
public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeAll
    public  static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("After all");
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each");
    }

    @Test
//    @DisplayName("Test method add(Integer first, Integer second)")
    public void testAddSucces(){
       var result = calculator.add(2,3);
       assertEquals(5, result);

    }

    @Test
//    @DisplayName("Test method divide(Integer first, Integer second) SUCCESS")
    public void testDivideSuccess(){
        var result = calculator.divide(100,10);
        assertEquals(10, result);
    }

    @Test
//    @DisplayName("Test method divide(Integer first, Integer second) FAIL")
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }

    @Test
    @Disabled
    public void testComingSoon(){

    }

    @Test
    public void testAborted(){
        var profile = System.getenv("PROFILE");
        if (!"DEV".equals(profile)){
            throw new TestAbortedException("Test dibatalkan karena bukan DEV");
        }

        // unit test untuk DEV
    }

    @Test
    public void testAssumption(){
        assumeTrue("DEV".equals(System.getenv("PROFILE")));
    }
}
