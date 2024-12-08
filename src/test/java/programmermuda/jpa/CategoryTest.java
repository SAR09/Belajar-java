package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Category;
import programmermuda.jpa.entity.Customer;
import programmermuda.jpa.util.JpaUtil;

public class CategoryTest {
    @Test
    void insert() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Category category = new Category();
        category.setName("Gadget");
        category.setDescription("Gadget Murah");
        entityManager.persist(category);

        Assertions.assertNotNull(category.getId());


        entityTransaction.commit();
        entityManager.close();
    }
}
