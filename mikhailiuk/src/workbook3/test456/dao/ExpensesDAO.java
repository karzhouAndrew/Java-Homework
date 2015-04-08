package workbook3.test456.dao;

import workbook3.test456.entity.Expense;

import java.util.ArrayList;

/**
 * Created by Natashka on 07.04.2015.
 */
public interface ExpensesDAO {
    Expense getExpense(int id);

    void addExpense(Expense expense);

    ArrayList<Expense> getExpenses();
}
