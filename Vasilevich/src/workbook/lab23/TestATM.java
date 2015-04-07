package workbook.lab23;

/**
 * Created by vasilevich on 23.02.2015.
 * Создтькласс и объекты описывающие банкомат. Набор купюр находящихся в банкомате должен создаваться тремя свойствами:
 * количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую деньги.
 * На вод передается сумма денег. На выход булевское значение. При снятии денег функия должна распечатывать каким количеством купюр какого номинала выдаетя сумма.
 * Создаьт конструктор с тремя параметрами - количеством купюр.
 */
public class TestATM {

    public static void main(String[] args) {
        DataATM dataATM = new DataATM();
        dataATM.addNotes(3, 5, 5);
        System.out.println("Сумма в банкомате = " + dataATM.getAllSumATM());
        int getSum = 790;
        System.out.println("Попытка получить сумму " + getSum);
        dataATM.recieveSum(getSum);
        System.out.println("Осталось денег в банкомате = " + dataATM.getAllSumATM());
    }
}
