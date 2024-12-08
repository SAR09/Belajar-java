package programmermuda.jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import org.junit.jupiter.api.Test;
import programmermuda.jpa.entity.Image;
import programmermuda.jpa.util.JpaUtil;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class LargeObjectTest {

    @Test
    void testPath() {
        System.out.println(getClass().getResource("/images/sample.jpg"));

    }

    @Test
    void largeObject() throws IOException {
        EntityManagerFactory entityManagerFactory = JpaUtil.getEntityManagerFactory();
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        Image image = new Image();
        image.setName("contoh image 2");
        image.setDescription("contoh description image 2");

        // Gunakan java.io.File untuk membaca file
        var resource = getClass().getResource("/images/sample.jpg");
        if (resource == null) {
            throw new IOException("File not found: /images/sample.jpg");
        }
        File file = new File(resource.getFile()); // Mendapatkan file dari resource
        byte[] bytes = Files.readAllBytes(file.toPath());
        image.setImage(bytes);
        entityManager.persist(image);

        entityTransaction.commit();
        entityManager.close();
    }
}
