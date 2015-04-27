package workbook.lab23;
/*
Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате должен задаваться тремя свойствами:
количеством купюр номиналом 20 50 100. Сделать методы для добавления денег в банкомат. Сделать функцию снимающую
деньги. На вход передается сумма денег. На выход – булевское значение (операция удалась или нет). При снятии денег
функция должна рапечатывать каким количеством купюр какого номинала выдается сумма. Создать конструктор с тремя
параметрами – количеством купюр. Прочее – на  ваше усмотрение.
 */
public class ATMMoney {
    private int twenty, fifty, hundred, sum;
    final int tN = 20, fN = 50, hN = 100;

    public ATMMoney(int twenty, int fifty, int hundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.hundred = hundred;
        sum = twenty * tN + fifty * fN + hundred * hN;
    }

    public boolean outputOfMoney(int money) {
        boolean success = false;
        if (sum >= money && ((money % tN == 0) || (money % fN == 0))) {
            int changeH = 0, changeF = 0, changeT = 0;
            int total = 0, i = 1;

            while (i <= hundred && total <= money) {
                i++;
                total += hN;
                changeH++;
                if (total > money) {
                    total -= hN;
                    changeH--;
                    break;
                }
            }
            i = 1;
            while (i <= fifty && total <= money) {
                if (((money - total - 50) % 20 != 0) && (fifty == 1)) {
                    break;
                }
                i++;
                total += fN;
                changeF++;
                if (total > money) {
                    total -= fN;
                    changeF--;
                    break;
                }
            }
            i = 1;
            while (i <= twenty && total <= money) {
                i++;
                total += tN;
                changeT++;
                if (total > money) {
                    total -= tN;
                    changeT--;
                    break;
                }
            }
            if (total == money) {
                System.out.println("\nWithdraw money:" + money);
                System.out.println("20: " + changeT);
                System.out.println("50: " + changeF);
                System.out.println("100: " + changeH);
                hundred -= changeH;
                fifty -= changeF;
                twenty -= changeT;
                sum = sum - hN * changeH - fN * changeF - tN * changeT;
                success = true;
            }
        } else {
            success = false;
        }
        return success;
    }

    public  void successOperation(int quest){
        if (this.outputOfMoney(quest))
            System.out.println("Operation was successful.");
        else System.out.println("\nOperation wasn`t successful. There is no required amount (" + quest + ") in the ATM." );
    }


    public int getTwenty() {
        return twenty;
    }

    public void setTwenty(int twenty) {
        this.twenty += twenty;
    }

    public int getFifty() {
        return fifty;
    }

    public void setFifty(int fifty) {
        this.fifty += fifty;
    }

    public int getHundred() {
        return hundred;
    }

    public void setHundred(int hundred) {
        this.hundred += hundred;
    }

    public void setAll(int twenty, int fifty, int hundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.hundred += hundred;
        sum += (twenty * tN + fifty * fN + hundred * hN);
    }

    public void getAll() {
        System.out.println("\nAny money left in the account:\n20: " + twenty + "\n50: " + fifty + "\n100: " + hundred + "\nall sum: " + sum);
    }
}
