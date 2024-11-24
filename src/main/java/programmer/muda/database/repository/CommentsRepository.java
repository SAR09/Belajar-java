package programmer.muda.database.repository;

import programmer.muda.database.entity.Comments;

import java.util.List;

public interface CommentsRepository {

    void insert(Comments comments);

    Comments findById(Integer id);

    List<Comments> findAll();

    List<Comments> findByEmail(String email);
}
