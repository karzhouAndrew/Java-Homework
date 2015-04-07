package workbook3.lab7.database.dao;

import workbook3.lab7.entity.Expense;

import java.util.List;

public interface ExpenseDAO {

    void addExpense(final Expense expense);

    void deleteExpense(final Expense expense);

    void updateExpense(final Expense expense);

    List<Expense> getExpenses();

}
