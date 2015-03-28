package workbook.lab23;

/**
 * Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в банкомате
 * должен задаваться тремя свойствами: количеством купюр номиналом 20 50 100. Сделать
 * методы для добавления денег в банкомат. Сделать функцию снимающую деньги. На вход
 * передается сумма денег. На выход – булевское значение (операция удалась или нет).
 * При снятии денег функция должна рапечатывать каким количеством купюр какого номинала
 * выдается сумма. Создать конструктор с тремя параметрами – количеством купюр. Прочее – на  ваше усмотрение.
 */
public class Load {
    public static void main(String[] args) {
        Atm atm = new Atm();
        ServiceMan serviceMan = new ServiceMan();
        serviceMan.service(atm);
        Client client = new Client();
        client.getBalance();
        client.withdrawMoney(atm);
        System.out.println("Колличество купюр номиналом 100: "+atm.getBanknote100());
        System.out.println("Колличество купюр номиналом 50: "+atm.getBanknote50());
        System.out.println("Колличество купюр номиналом 20: "+atm.getBanknote20());
        client.putMoney();
        client.getBalance();

    }
}
