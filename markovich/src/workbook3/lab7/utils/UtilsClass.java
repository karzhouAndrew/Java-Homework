package workbook3.lab7.utils;

import workbook3.lab7.entity.Expense;
import workbook3.lab7.entity.Receiver;

import java.util.List;

public class UtilsClass {
    public static void printExpensesList(List<Expense> expenseList){
        for (Expense expense : expenseList) {
            System.out.println(expense);
        }
    }

    public static void printReceiversList(List<Receiver> receiverList) {
        for (Receiver receiver : receiverList) {
            System.out.println(receiver);
        }
    }
}
