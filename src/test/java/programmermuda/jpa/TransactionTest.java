package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.util.JpaUtil;

public class TransactionTest {

    @Test
    void transaction() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        Assertions.assertNotNull(entityTransaction);

        try {
            entityTransaction.begin();
            // manipulasi database
            entityTransaction.commit();
        }catch (Throwable throwable){
            entityTransaction.rollback();
        }


        entityManager.close();
    }
}
