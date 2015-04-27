package workbook.lab24;

/**
 * Создать иерархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов, часть
 * из них включить в розетку. Иерархия должна иметь хотя бы три уровня.
 */
public class TV {
    public static void main(String[] args) {
        Model2000 model2000 = new Model2000("Horizont");
        Model2007 model2007 = new Model2007("LG");
        Model2014 model2014 = new Model2014("Samsung");

        model2007.setConnectedToTheSocket();
        model2014.setConnectedToTheSocket();

        model2000.isConnectedToTheSocket();
        model2007.isConnectedToTheSocket();
        model2014.isConnectedToTheSocket();
    }
}

