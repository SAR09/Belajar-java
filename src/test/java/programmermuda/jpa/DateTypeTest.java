package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Customer;
import programmermuda.jpa.util.JpaUtil;

public class DateTypeTest {

    @Test
    void dataType() {
            EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
            EntityManager entityManager = entityManagerFactory.createEntityManager();
            EntityTransaction entityTransaction = entityManager.getTransaction();
            entityTransaction.begin();

            Customer customer = new Customer();
            customer.setId("2");
            customer.setName("Amin");
            customer.setPrimary_email("contoh@example.com");
            customer.setAge((byte) 22);
            customer.setMarried(false);

            entityManager.persist(customer);

            entityTransaction.commit();
            entityManager.close();

    }
}
