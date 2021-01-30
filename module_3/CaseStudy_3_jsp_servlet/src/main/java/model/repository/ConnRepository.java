package model.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnRepository {

    private Connection connection;
    private String jdbcURL = "jdbc:mysql://localhost:3306/furuma_jsp_servlet?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Duongthuhp01";

    public ConnRepository() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
