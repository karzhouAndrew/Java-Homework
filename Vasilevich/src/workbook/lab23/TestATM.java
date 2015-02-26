package workbook.lab23;

/**
 * Created by vasilevich on 23.02.2015.
 */
public class TestATM {

    public static void main(String[] args) {
        DataATM dataATM = new DataATM();
        dataATM.addNotes(3, 5, 5);

        System.out.println("Сумма в банкомате = " + dataATM.getAllSumATM());

        int getSum = 710;


        System.out.println("Попытка получить сумму " + getSum);
        dataATM.recieveSum(getSum);

        System.out.println("Осталось денег в банкомате = " + dataATM.getAllSumATM());

    }
}
