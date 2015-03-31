package workbook.lab22;


/**
 * Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен
 * задаваться тремя свойствами: секундами, минутами, часами. Сделать методы для получения
 * полного количества секунд в объекте, сравнения двух объектов (метод должен работать
 * аналогично compareTo в строках). Создать два конструктора: получающий общее количество
 * секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.
 */
public class Load {
    public static void main(String[] args) {
        TimeObjectClass time = new TimeObjectClass(4,44,24);
        TimeObjectClass otherTime = new TimeObjectClass(5);
        time.compareTo(otherTime);
        System.out.println(time.timeInSeconds());
        System.out.println(otherTime.timeInSeconds());
        System.out.print(time.compareTo(otherTime));
    }

}
