package workbook.classesAndInterfaces.task04;

public class Main {
    public static void main(String[] args) {
        ATM atm1 = new ATM(300, 300, 300);
        atm1.addMoney(5,1,1);
        atm1.getMoney(1680);
    }
}
/*
Total inside ATM: 51000

You added 570
Total inside ATM: 51570

You received 1680:
10 by [100]
10 by [50]
9 by [20]

Total inside ATM: 49890*/
