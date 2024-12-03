package programmer.muda.reflection;

import org.junit.jupiter.api.Test;
import programmer.muda.reflection.data.Person;

import java.lang.reflect.Field;

public class FieldTest {

    @Test
    void testGetFields() {

        Class<Person> personClass = Person.class;

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields){
            System.out.println(field.getName() + " : " + field.getType().getName());
        }
    }

    @Test
    void testGetFieldValue() throws IllegalAccessException, NoSuchFieldException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Saiful", "Amin");

        Object result = (String) firstName.get(person1);
        System.out.println(result);

        Person person2 = new Person("Budi", "Kurniawan");
        String result2 = (String) firstName.get(person2);
        System.out.println(result2);
    }

    @Test
    void testFieldValue() throws IllegalAccessException, NoSuchFieldException {

        Class<Person> personClass = Person.class;
        Field firstName = personClass.getDeclaredField("firstName");
        firstName.setAccessible(true);

        Person person1 = new Person("Saiful", "Amin");
        firstName.set(person1, "Joko"); // person1.setFirstaname("Joko
        System.out.println(person1.getFirstName());

        Person person2 = new Person("Budi", "Kurniawan");
        firstName.set(person2, "Tono"); //person2.setFirstName("Tono")
        System.out.println(person2.getFirstName());
    }
}
