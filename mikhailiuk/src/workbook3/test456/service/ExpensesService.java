package workbook3.test456.service;

import workbook3.test456.dao.ExpensesDAO;
import workbook3.test456.dao.impl.ExpensesDAOimpl;
import workbook3.test456.entity.Expense;

import java.util.ArrayList;

/**
 * Created by Natashka on 08.04.2015.
 */
public class ExpensesService {
    private ExpensesDAO expensesDAO = new ExpensesDAOimpl();

    public Expense getExpense(int id) {
        return expensesDAO.getExpense(id);
    }

    public void addExpense(Expense expense) {
        expensesDAO.addExpense(expense);
    }

    public ArrayList<Expense> getExpenses() {
        return expensesDAO.getExpenses();
    }
}
