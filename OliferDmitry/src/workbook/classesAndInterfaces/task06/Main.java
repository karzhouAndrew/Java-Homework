package workbook.classesAndInterfaces.task06;
// Sozdat' ierarhiu klassov, opisyvauschih bankovskie kartochki. Ierarhija doljna imet' hotia by 3 urovnia.
public class Main {
    public static void main(String[] args) {
        Card visa1 = new Visa(Type.CREDIT, Currency.USD, "MM-Bank", "Dzmitry Alifer", "0123 4567 8901 2345");
        visa1.printOwner();
    }
}
