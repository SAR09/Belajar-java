package programmer.muda.maven.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import programmer.muda.maven.Person;
import programmer.muda.maven.repository.PersonRepository;

@Extensions({
        @ExtendWith(MockitoExtension.class)
})
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    private PersonService personService;

    @BeforeEach
    public void setUp(){
        personService = new PersonService(personRepository);
    }

    @Test
    public void tesGetPersontNotFound(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            personService.get("not found");
        } );
    }

    @Test
    public void testGetPersonSuccess(){
        // menambah behavior ke mock object
        Mockito.when(personRepository.selectById("saiful"))
                .thenReturn(new Person("saiful","Saiful"));
        var person = personService.get("saiful");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("saiful", person.getId());
        Assertions.assertEquals("Saiful", person.getName());
    }

    @Test
    public void testRegisterSuccess(){
        var person = personService.register("Saiful");
        Assertions.assertNotNull(person);
        Assertions.assertEquals("Saiful", person.getName());
        Assertions.assertNotNull(person.getId());

        Mockito.verify(personRepository, Mockito.times(1))
                .insert(new Person(person.getId(), "Saiful"));
    }

}
