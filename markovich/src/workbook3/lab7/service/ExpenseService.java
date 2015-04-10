package workbook3.lab7.service;

import workbook3.lab7.database.dao.ExpenseDAO;
import workbook3.lab7.database.dao.ExpenseDAOImpl;
import workbook3.lab7.entity.Expense;

import java.util.List;

public class ExpenseService {
    private ExpenseDAO expenseDAO;

    public ExpenseService() {
        expenseDAO = new ExpenseDAOImpl();
    }

    public void addExpense(Expense expense) {
        expenseDAO.addExpense(expense);
    }

    public void updateExpense(Expense expense) {
        expenseDAO.updateExpense(expense);
    }

    public void deleteExpense(Expense expense) {
        expenseDAO.deleteExpense(expense);
    }

    public List<Expense> getExpenses() {
        return expenseDAO.getExpenses();
    }
}