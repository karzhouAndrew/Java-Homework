package workbook3.lab7.database.dao;

import workbook3.lab7.entity.Expense;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static workbook3.lab7.utils.UtilsDB.*;

public class ExpenseDAOImpl implements ExpenseDAO {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/workbook3ver1";
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";

    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "admin";

    private static final String SQL_QUERY_ADD_EXPENSE = "INSERT INTO expenses (idExpense, paydate, receiver, value) VALUES (?, ?, ?, ?)";
    private static final String SQL_QUERY_DELETE_EXPENSE = "DELETE FROM expenses WHERE idExpense = ? ";
    private static final String SQL_QUERY_UPDATE_EXPENSE = "UPDATE expenses SET paydate =  ?, value = ? WHERE idExpense = ?";
    private static final String SQL_QUERY_GET_EXPENSES = "SELECT idExpense, paydate, value, nameReceiver FROM expenses, receivers WHERE receiver=receivers.idReceiver";


    @Override
    public void addExpense(Expense expense) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_ADD_EXPENSE);
            preparedStatement.setInt(1, expense.getIdExpense());
            preparedStatement.setString(2, expense.getPaydate());
            preparedStatement.setString(3, expense.getReceiver());
            preparedStatement.setInt(4, expense.getValue());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public void deleteExpense(Expense expense) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_DELETE_EXPENSE);
            preparedStatement.setInt(1, expense.getIdExpense());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public void updateExpense(Expense expense) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_UPDATE_EXPENSE);
            preparedStatement.setString(1, expense.getPaydate());
            preparedStatement.setInt(2, expense.getValue());
            preparedStatement.setInt(3, expense.getIdExpense());
            preparedStatement.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement);
        }
    }

    @Override
    public List<Expense> getExpenses() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Expense> expenseList = null;
        try {
            connection = getDBConnection(JDBC_DRIVER, DB_URL, DB_USERNAME, DB_PASSWORD);
            preparedStatement = connection.prepareStatement(SQL_QUERY_GET_EXPENSES);
            resultSet = preparedStatement.executeQuery();
            expenseList = initExpenses(resultSet);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            closeDBConnection(connection, preparedStatement, resultSet);
        }
        return expenseList;
    }

    private List<Expense> initExpenses(ResultSet resultSet) throws SQLException {
        List<Expense> expenseList = new ArrayList<Expense>();
        while (resultSet.next()) {
            Expense expense = new Expense();
            expense.setIdExpense(resultSet.getInt(1));
            expense.setPaydate(resultSet.getString(2));
            expense.setValue(resultSet.getInt(3));
            expense.setReceiver(resultSet.getString(4));
            expenseList.add(expense);
        }
        return expenseList;
    }
}