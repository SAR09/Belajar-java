package programmer.muda.reflection;

import org.junit.jupiter.api.Test;
import programmer.muda.reflection.data.Gender;

import java.util.Arrays;

public class EnumTest {

    @Test
    void testEnum() {

        Class<Gender> genderClass = Gender.class;

        System.out.println(genderClass.getName());
        System.out.println(genderClass.getSuperclass());
        System.out.println(Arrays.toString(genderClass.getEnumConstants()));
        System.out.println(genderClass.isEnum());
    }
}