package workbook.lab16;

/**
 * Created by Asus on 21.02.2015.
 */
public class Sixteen {
    public static void main(String[] args) {
        String str = "Конкатенация строк - это, соединение, строк: при помощи оператора - х";
        int quantityDash = 0;
        int numberOfSell = 0;
        int quantityComma = 0;
        int quantityColon = 0;
        int quantityPoint = 0;
        while (numberOfSell != -1) {
            numberOfSell = str.indexOf('-', numberOfSell);
            if (numberOfSell != -1) {
                numberOfSell++;
                quantityDash++;
            }
        }
        System.out.println("Количество тире = " + quantityDash);
        numberOfSell = 0;
        while (numberOfSell != -1) {
            numberOfSell = str.indexOf(',', numberOfSell);
            if (numberOfSell != -1) {
                numberOfSell++;
                quantityComma++;
            }
        }
        System.out.println("Количество запятых = " + quantityComma);
        numberOfSell = 0;
        while (numberOfSell != -1) {
            numberOfSell = str.indexOf(':', numberOfSell);
            if (numberOfSell != -1) {
                numberOfSell++;
                quantityColon++;
            }
        }
        System.out.println("Количество двоеточий = " + quantityColon);
        numberOfSell = 0;
        while(numberOfSell != -1){
            numberOfSell = str.indexOf('.', numberOfSell);
            if (numberOfSell != -1) {
                numberOfSell++;
                quantityPoint++;
            }
        }
        System.out.println("Количество точек = " + quantityPoint);
        System.out.println("Общее количество знаков препинания = " + (quantityDash + quantityColon + quantityComma + quantityPoint));
    }
}

