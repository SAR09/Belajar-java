package programmer.muda.maven;

import org.junit.jupiter.api.*;

@DisplayName("information test")
public class InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("this is test1")
    public void test(TestInfo info){
        System.out.println(info.getDisplayName());
        System.out.println(info.getTags());
        System.out.println(info.getTestClass().orElse(null));
        System.out.println(info.getTestMethod().orElse(null));
    }
}
