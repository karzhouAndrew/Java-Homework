package workbook3.test456.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Natashka on 07.04.2015.
 */
public class DBUtils {
    private final String dbUrl = "jdbc:mysql://127.0.0.1:3306/db1";
    private final String username = "root";
    private final String password = "admin";

    public Connection getDBConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver");
            e.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(dbUrl, username, password);
        } catch (SQLException e) {
            System.out.println("Check database url, username or password");
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection(Connection connection, PreparedStatement preparedStatement) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Problem with closing connection");
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("Problem with SQL query");
                e.printStackTrace();
            }
        }
    }
}
