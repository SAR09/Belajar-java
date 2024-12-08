package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Customer;
import programmermuda.jpa.entity.CustomerType;
import programmermuda.jpa.util.JpaUtil;

public class EnumTest {

    @Test
    void enumTest() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Customer customer = new Customer();
        customer.setId("3");
        customer.setName("Rizki");
        customer.setPrimary_email("contoh2@example.com");
        customer.setMarried(false);
        customer.setAge((byte) 23);
        customer.setType(CustomerType.PREMIUM);

        entityManager.persist(customer);

        entityTransaction.commit();
        entityManager.close();
    }
}
