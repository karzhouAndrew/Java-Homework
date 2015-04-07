package workbook3.lab6;

import java.sql.*;

/**
 * Напишите программу получающую данные о расходе в качестве исходных параметров main,
 * и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран.
 * Измените предыдущую задачу таким образом, чтобы она использовала прекомпилированные запросы.
 */

public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workbook3ver1";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    private static final String SQL_INSERT_INTO = "INSERT INTO expenses (paydate, receiver, value) VALUES (?, ?, ?)";
    private static final String SQL_SHOW_TABLE = "SELECT paydate, value, nameReceiver FROM expenses,receivers WHERE receiver=receivers.idReceiver";

    private static Connection conn;
    private static PreparedStatement preparedStatement;
    private static ResultSet result;

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            preparedStatement = conn.prepareStatement(SQL_INSERT_INTO);
            preparedStatement.setDate(1, Date.valueOf("2011-06-30"));
            preparedStatement.setInt(2, 3);
            preparedStatement.setInt(3, 7777);
            preparedStatement.executeUpdate();

            preparedStatement.setDate(1, Date.valueOf("2011-05-11"));
            preparedStatement.setInt(2, 2);
            preparedStatement.setInt(3, 8888);
            preparedStatement.executeUpdate();

            result = preparedStatement.executeQuery(SQL_SHOW_TABLE);

            while (result.next()) {
                System.out.println(result.getDate(1) + " " + result.getInt(2) + " " + result.getString(3));
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Error loading driver - " + e);
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
                if (preparedStatement != null) {
                    preparedStatement.close();
                }
                if (result != null) {
                    result.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}
