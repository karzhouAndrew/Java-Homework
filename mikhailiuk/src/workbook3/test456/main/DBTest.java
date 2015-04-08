package workbook3.test456.main;

import workbook3.test456.entity.Expense;
import workbook3.test456.service.ExpensesService;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Создать DAO, использовать прекомпилир. запросы, получать данные о расходе, добавлять расход в базу, выводить таблицу на экран.
 */
public class DBTest {
    public static void main(String[] args) {
        ExpensesService expensesService = new ExpensesService();
        Expense expense = new Expense();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new expense date:");
        expense.setPayDate(scanner.nextLine());
        System.out.println("Enter new expense receiver code:");
        expense.setReceiver(Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter new expense amount:");
        expense.setAmount(Double.parseDouble(scanner.nextLine()));
        expensesService.addExpense(expense);
        ArrayList<Expense> expenses = expensesService.getExpenses();
        for (Expense tempExpense : expenses) {
            System.out.println(tempExpense);
        }
        System.out.println("Enter expense number:");
        System.out.println(expensesService.getExpense(Integer.parseInt(scanner.nextLine())));
    }
}
