package programmer.muda.maven.repository;

import programmer.muda.maven.Person;

public interface PersonRepository {

    Person selectById(String id);

    public void insert(Person person);
}
