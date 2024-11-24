package programmer.muda.database;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class TranssctionTest {

    @Test
    void testCommit() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        connection.setAutoCommit(false);

        String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";



        for (int i = 0; i < 100; i++){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "saiful@test");
            preparedStatement.setString(2, "hai");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }



        connection.commit();
        connection.close();
    }

    @Test
    void testRollback() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();
        connection.setAutoCommit(false);

        String sql = "INSERT INTO comments(email, comment) VALUES (?, ?)";



        for (int i = 0; i < 100; i++){
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "saiful@test");
            preparedStatement.setString(2, "hai");
            preparedStatement.executeUpdate();
            preparedStatement.close();
        }



        connection.rollback();
        connection.close();
    }
}
