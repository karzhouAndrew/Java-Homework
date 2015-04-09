package workbook3.lab7.main;

import workbook3.lab7.entity.Expense;
import workbook3.lab7.entity.Receiver;
import workbook3.lab7.service.ExpenseService;
import workbook3.lab7.service.ReceiverService;

import static workbook3.lab7.utils.UtilsClass.*;

import java.util.List;

/**
 * Создайте реализации DAO на основе интерфейсов приведенного выше.
 * Также необходимо создать классы Receiver и Expense, свойства которых соответствуют
 * полям таблиц базы данных расходов. Поле дата в классах можно хранить в виде строки.
 */

public class DAOExample {
    public static void main(String[] args) {

        Expense newExpense = new Expense(999, "2011-06-30", "3", 77777);
        ExpenseService expenseService = new ExpenseService();
        expenseService.addExpense(newExpense);

        System.out.println("Expenses after adding : ");
        List<Expense> expenseList = expenseService.getExpenses();
        printExpensesList(expenseList);

        System.out.println("Expenses after updating : ");
        newExpense.setPaydate("2020-01-01");
        newExpense.setValue(333333);
        expenseService.updateExpense(newExpense);
        expenseList = expenseService.getExpenses();
        printExpensesList(expenseList);

        System.out.println("Expenses after removing : ");
        expenseService.deleteExpense(newExpense);
        expenseList = expenseService.getExpenses();
        printExpensesList(expenseList);

        Receiver newReceiver = new Receiver(777, "Velcom");
        ReceiverService receiverService = new ReceiverService();
        receiverService.addReceiver(newReceiver);

        System.out.println("Receivers after adding : ");
        List<Receiver> receiverList = receiverService.getReceivers();
        printReceiversList(receiverList);

        System.out.println("Receivers after updating : ");
        newReceiver.setNameReceiver("Dozari");
        receiverService.updateReceiver(newReceiver);
        receiverList = receiverService.getReceivers();
        printReceiversList(receiverList);

        System.out.println("Receivers after removing : ");
        receiverService.deleteReceiver(newReceiver);
        receiverList = receiverService.getReceivers();
        printReceiversList(receiverList);
    }
}
