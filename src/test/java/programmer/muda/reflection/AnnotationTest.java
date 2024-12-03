package programmer.muda.reflection;

import org.junit.jupiter.api.Test;
import programmer.muda.reflection.data.Person;
import programmer.muda.reflection.validation.Validator;

public class AnnotationTest {

    @Test
    void testValidateUsingAnnotation() throws IllegalAccessException {

        Person person = new Person("Saiful", "Amin");
        Validator.validateNotBlank(person);
    }
}
