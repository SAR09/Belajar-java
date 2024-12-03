package programmer.muda.reflection;

import org.junit.jupiter.api.Test;
import programmer.muda.reflection.data.Person;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParamaterTest {

    @Test
    void getTestParamaters() {

        Class<Person> personClass = Person.class;
        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods){
            System.out.println(method.getName());
            Parameter[] parameters = method.getParameters();
            for (Parameter parameter : parameters){
                System.out.println("Paramater Name : " + parameter.getName());
                System.out.println("Paramater Type : " + parameter.getType());
            }
            System.out.println("===================");
        }
    }

    @Test
    void testInvokeMethodWithParamater() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        Class<Person> personClass = Person.class;
        Method setFirstName = personClass.getDeclaredMethod("setFirstName", String.class);

        Person person = new Person("Saiful", "Amin");
        setFirstName.invoke(person, "Joko");

        System.out.println(person.getFirstName());


    }
}
