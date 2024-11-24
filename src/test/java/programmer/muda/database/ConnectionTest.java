package programmer.muda.database;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    @BeforeAll
    static void beforeAll(){
        try {
            Driver mySqlDriver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(mySqlDriver);
        }catch (SQLException exception){
            exception.printStackTrace();
        }
    }
    @Test
    void testConnection(){
        String jdbcurl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "Mysqlsaiful09";

        try {
            Connection connection = DriverManager.getConnection(jdbcurl,username,password);
            System.out.println("Sukses connect ke database");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }

    }

    @Test
    void testConnectionClose(){
        String jdbcurl = "jdbc:mysql://localhost:3306/belajar_java_database";
        String username = "root";
        String password = "Mysqlsaiful09";

        try (Connection connection = DriverManager.getConnection(jdbcurl,username,password)){
            System.out.println("Sukses connect ke database");
        }catch (SQLException exception){
            Assertions.fail(exception);
        }

    }
}
