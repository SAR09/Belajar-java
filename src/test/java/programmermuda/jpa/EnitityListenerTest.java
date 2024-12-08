package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Category;
import programmermuda.jpa.entity.Customer;
import programmermuda.jpa.entity.Member;
import programmermuda.jpa.util.JpaUtil;

public class EnitityListenerTest {
    @Test
    void listener() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Category category = new Category();
        category.setName("contoh");

        entityManager.persist(category);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void listenerEntity() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Member member = entityManager.find(Member.class, 1);
        Assertions.assertEquals("Mr Saiful Amin Rizki", member.getFullName());

        entityTransaction.commit();
        entityManager.close();
    }
}
