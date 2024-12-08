package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.*;
import programmermuda.jpa.util.JpaUtil;

import java.time.LocalDateTime;

public class InheritanceTest {

    @Test
    void singleTableInsert() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Employee employee = new Employee();
        employee.setId("joko");
        employee.setName("Joko Budi");
        entityManager.persist(employee);

        Manager manager = new Manager();
        manager.setId("ahmad");
        manager.setName("Ahmad Budi");
        manager.setTotalEmployee(10);
        entityManager.persist(manager);

        VicePresident vp = new VicePresident();
        vp.setId("erik");
        vp.setName("Erik Kurniawan");
        vp.setTotalManager(5);
        entityManager.persist(vp);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void singleTableFind() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Manager manager = entityManager.find(Manager.class, "ahmad");
        Assertions.assertEquals("Ahmad Budi", manager.getName());

        Employee employee = entityManager.find(Employee.class, "erik");
        VicePresident vp = (VicePresident) employee;
        Assertions.assertEquals("Erik Kurniawan", vp.getName());


        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void joinedTableInsert() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        PaymentGopay gopay = new PaymentGopay();
        gopay.setId("gopay1");
        gopay.setAmount(100_000L);
        gopay.setGopayId("08113131231");
        entityManager.persist(gopay);

        PaymentCreditCard creditCard = new PaymentCreditCard();
        creditCard.setId("cc1");
        creditCard.setAmount(500_000L);
        creditCard.setMaskedCard("455-555");
        creditCard.setBank("BRI");
        entityManager.persist(creditCard);

        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void joinedTableFind() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        PaymentGopay gopay = entityManager.find(PaymentGopay.class, "gopay1");
        PaymentCreditCard creditCard = entityManager.find(PaymentCreditCard.class, "cc1");




        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void joinedTableFindPaarent() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Payment payment = entityManager.find(Payment.class, "gopay1");




        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void tablePerClassInsert() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Transaction transaction = new Transaction();
        transaction.setId("t1");
        transaction.setCreatedAt(LocalDateTime.now());
        transaction.setBalance(1_000_000L);
        entityManager.persist(transaction);

        TransactionDebit transactionDebit = new TransactionDebit();
        transactionDebit.setId("t2");
        transactionDebit.setCreatedAt(LocalDateTime.now());
        transactionDebit.setBalance(2_000_000L);
        transactionDebit.setDebitAmount(1_000_000L);
        entityManager.persist(transactionDebit);

        TransactionCredit transactionCredit = new TransactionCredit();
        transactionCredit.setId("t3");
        transactionCredit.setCreatedAt(LocalDateTime.now());
        transactionCredit.setBalance(2_000_000L);
        transactionCredit.setCreditAmount(1_000_000L);
        entityManager.persist(transactionCredit);


        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void tablePerClassFindChild() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        TransactionDebit transactionDebit = entityManager.find(TransactionDebit.class, "t2");

        TransactionCredit transactionCredit = entityManager.find(TransactionCredit.class, "t3");


        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void tablePerClassFindParent() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Transaction transaction = entityManager.find(Transaction.class, "t1");


        entityTransaction.commit();
        entityManager.close();
    }

    @Test
    void mappedSuperClass() {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Brand brand = new Brand();
        brand.setId("xiaomi");
        brand.setName("Xiaomi");
        brand.setDescription("Xiaomi hp bagus");
        brand.setCreatedAt(LocalDateTime.now());
        brand.setUpdatedAt(LocalDateTime.now());
        entityManager.persist(brand);

        entityTransaction.commit();
        entityManager.close();
    }
}
