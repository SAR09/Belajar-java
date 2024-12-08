package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Brand;
import programmermuda.jpa.util.JpaUtil;

import java.time.LocalDateTime;

public class ManagedEntityTest {
    @Test
    void managedEntity() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        // unmanaged entity
        Brand brand = new Brand();
        brand.setId("apple");
        brand.setName("Apple");
        // managed entity
        entityManager.persist(brand);

        brand.setName("Apple International");

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void findManagedEntity() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        // managed entity
        Brand brand = entityManager.find(Brand.class, "apple");
        brand.setName("Apple Indonesia");




        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void detachManagedEntity() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        // managed entity
        Brand brand = entityManager.find(Brand.class, "apple");
        entityManager.detach(brand);
        brand.setName("Apple Indonesia");


        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void findManagedEntityAfterTransaction() throws InterruptedException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        // managed entity
        Brand brand = entityManager.find(Brand.class, "apple");

        entityTransaction.commit();
        entityManager.close();
        brand.setName("Apple Indonesia");
    }
}
