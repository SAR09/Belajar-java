package programmer.muda.maven;

import org.junit.jupiter.api.Test;

public class LifecycleTest {

    private String temp;

    @Test
    public void testA(){
        temp = "Saiful";
    }

    @Test
    public void testB(){
        System.out.println(temp);
    }
}
