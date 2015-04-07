package workbook3.lab5;

import java.sql.*;

/**
 * Напишите программу получающую данные о расходе в качестве исходных параметров main,
 * и добавляющую этот расход в базу, после чего выводящую таблицу расходов на экран
 */
public class Main {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workbook3ver1";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

    private static final String SHOW_TABLE_QUERY = "SELECT paydate, value, nameReceiver FROM expenses,receivers WHERE receiver=receivers.idReceiver";

    private static final String INTO_QUERY_1 = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-01', '1', '17300')";
    private static final String INTO_QUERY_2 = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-02', '2', '35900')";
    private static final String INTO_QUERY_3 = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-03', '3', '80500')";
    private static final String INTO_QUERY_4 = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-04', '1', '14200')";
    private static final String INTO_QUERY_5 = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-05', '2', '63000')";

    private static Connection conn;
    private static Statement statement;
    private static ResultSet result;

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);

            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = conn.createStatement();
            statement.executeUpdate(INTO_QUERY_1);
            statement.executeUpdate(INTO_QUERY_2);
            statement.executeUpdate(INTO_QUERY_3);
            statement.executeUpdate(INTO_QUERY_4);
            statement.executeUpdate(INTO_QUERY_5);

            result = statement.executeQuery(SHOW_TABLE_QUERY);

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
                if (statement != null) {
                    statement.close();
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
