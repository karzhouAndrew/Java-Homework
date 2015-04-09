package workbook3.lab7.utils;

import java.sql.*;

public class UtilsDB {
    public static Connection getDBConnection(String driver, String url, String user, String password) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }

    public static void closeDBConnection(Connection connection, PreparedStatement preparedStatement){
        try {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void closeDBConnection(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet){
        try {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null){
                resultSet.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
