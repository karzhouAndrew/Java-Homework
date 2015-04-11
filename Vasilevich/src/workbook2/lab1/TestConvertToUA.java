package workbook2.lab1;

/**
 * Created by vasilevich on 26.03.2015.
 * Написать код выводящий число 153.5 в денежном виде для Украины
 */
public class TestConvertToUA {
    public static void main(String[] args) {
        ConvertToUA convertToUA = new ConvertToUA();
        convertToUA.convertMoney(153.5);
    }
}
