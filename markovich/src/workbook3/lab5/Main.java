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

    private static Connection conn;
    private static Statement statement;

    public static void main(String[] args) {

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Connection is OK!");

            String showTableQuery = "SELECT paydate, value, nameReceiver FROM expenses,receivers WHERE receiver=receivers.idReceiver";

            conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            statement = conn.createStatement();

            String intoQuery = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-01', '1', '17300')";
            statement.executeUpdate(intoQuery);

            intoQuery = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-02', '2', '35900')";
            statement.executeUpdate(intoQuery);

            intoQuery = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-03', '3', '80500')";
            statement.executeUpdate(intoQuery);

            intoQuery = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-04', '1', '14200')";
            statement.executeUpdate(intoQuery);

            intoQuery = "INSERT INTO expenses (paydate, receiver, value) VALUES('2015-04-05', '2', '63000')";
            statement.executeUpdate(intoQuery);

            ResultSet result = statement.executeQuery(showTableQuery);

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
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }

    }
}
