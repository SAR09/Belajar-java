package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.util.JpaUtil;

public class EntityManagerTest {

    @Test
    void create() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // operasi database
        Assertions.assertNotNull(entityManager);

        entityManager.close();
    }
}
