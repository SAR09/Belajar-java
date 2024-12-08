package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Customer;
import programmermuda.jpa.util.JpaUtil;

public class ColumnTest {

    @Test
    void column() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("1");
        customer.setName("Saiful");
        customer.setPrimary_email("contoh@example.com");
        customer.setFulName("Saiful Amin Rizki");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void transientTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("4");
        customer.setName("Saiful");
        customer.setPrimary_email("contoh@example.com");
        customer.setFulName("Saiful Amin Rizki");

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
}
