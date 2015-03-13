package workbook.lab28;

/**
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описаных классов, часть из них
 * включить в розетку.
 * Иерархия должна иметь хотя бы три уровня.
 */
public class Test {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        Microwave microwave = new Microwave();
        ElectricStole electricStole = new ElectricStole();
        fridge.work();
        microwave.work();
        electricStole.work();
    }
}
