package programmer.muda.maven;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;


import java.util.List;

public class MockTest {

    @Test
    public void testMock(){
        List<String> list = Mockito.mock(List.class);

        Mockito.when(list.get(0)).thenReturn("Saidful");

        System.out.println(list.get(0));

        Mockito.verify(list, Mockito.times(1)).get(0);
    }
}
