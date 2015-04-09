package workbook3.test456.dao.impl;

import workbook3.test456.dao.ExpensesDAO;
import workbook3.test456.entity.Expense;
import workbook3.test456.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Natashka on 07.04.2015.
 */
public class ExpensesDAOimpl implements ExpensesDAO {
    private final String SQL_ADD_EXPENSE = "insert into expenses (paydate,receiver,amount) values(?,?,?)";
    private final String SQL_GET_EXPENSE = "select * from expenses where id=?";
    private final String SQL_GET_EXPENSES = "select * from expenses";

    @Override
    public Expense getExpense(int id) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Expense expense = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_GET_EXPENSE);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                expense = initExpense(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
        return expense;
    }

    @Override
    public void addExpense(Expense expense) {
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_ADD_EXPENSE);
            preparedStatement.setString(1, expense.getPayDate());
            preparedStatement.setInt(2, expense.getReceiver());
            preparedStatement.setDouble(3, expense.getAmount());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
    }

    @Override
    public ArrayList<Expense> getExpenses() {
        ArrayList<Expense> expenses = new ArrayList<Expense>();
        DBUtils dbUtils = new DBUtils();
        Connection connection = dbUtils.getDBConnection();
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        try {
            preparedStatement = connection.prepareStatement(SQL_GET_EXPENSES);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                expenses.add(initExpense(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            dbUtils.closeConnection(connection, preparedStatement);
        }
        return expenses;
    }

    public Expense initExpense(ResultSet resultSet) {
        Expense expense = new Expense();
        try {
            expense.setId(resultSet.getInt(1));
            expense.setPayDate(resultSet.getString(2));
            expense.setReceiver(resultSet.getInt(3));
            expense.setAmount(resultSet.getDouble(4));
        } catch (SQLException e) {
            System.out.println("Problem during expense initialization");
            e.printStackTrace();
        }
        return expense;
    }
}
