package programmer.muda.reflection;

import org.junit.jupiter.api.Test;
import programmer.muda.reflection.data.NameAble;
import programmer.muda.reflection.data.Person;

import java.util.Arrays;

public class InterfaceTest {

    @Test
    void testClass() {

        Class<NameAble> nameAbleClass = NameAble.class;

        System.out.println(nameAbleClass.getName());
        System.out.println(nameAbleClass.isInterface()  );
        System.out.println(nameAbleClass.getSuperclass());
        System.out.println(Arrays.toString(nameAbleClass.getInterfaces()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredFields()));
        System.out.println(Arrays.toString(nameAbleClass.getDeclaredConstructors()));
    }

    @Test
    void testSuperInterfaces() {
        Class<Person> personClass = Person.class;
        System.out.println(personClass.getInterfaces());
    }
}
