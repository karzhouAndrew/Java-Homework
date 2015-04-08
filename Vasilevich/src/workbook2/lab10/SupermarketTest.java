package workbook2.lab10;

/**
 * Created by vasilevich on 03.04.2015.
 * Напишите программу моделирующую кассы в магазине. Существвует несколько касс, работающих одновременно. Каждый покупатель отдельный поток.
 * Общее количество покупателей может быть больше чем количество касс, но одновременно не может обрабатываться больше покупателей чем количество касс.
 * У каждого покупателя есть набор товаров, которые должны быть введены в процессе обслдуживания.
 */
public class SupermarketTest {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket(4, 30);
        supermarket.startWorkCashier();
        supermarket.checkSupermarketCashAfterWork();
    }
}
