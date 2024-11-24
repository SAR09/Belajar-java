package programmer.muda.database;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmer.muda.database.entity.Comments;
import programmer.muda.database.repository.CommentsRepository;
import programmer.muda.database.repository.CommentsRepositoryImpl;

import java.util.List;

public class RepositoryTest {

    private CommentsRepository commentsRepository;

    @BeforeEach
    void setUp(){
        commentsRepository = new CommentsRepositoryImpl();
    }
    @Test
    void testInsert() {
        Comments comments = new Comments("saiful@test", "hi");
        commentsRepository.insert(comments);

        Assertions.assertNotNull(comments.getId());
        System.out.println(comments.getId());
    }

    @Test
    void testFindById() {
       Comments comments = commentsRepository.findById(2404);
       Assertions.assertNotNull(comments);
        System.out.println(comments.getId());
        System.out.println(comments.getEmail());
        System.out.println(comments.getComment());
    }

    @Test
    void testFindAll() {
     List<Comments> comments =  commentsRepository.findAll();
        System.out.println(comments.size());
    }

    @Test
    void findByEmail() {
        List<Comments> comments =  commentsRepository.findByEmail("saiful@test");
        System.out.println(comments.size());
    }
}
