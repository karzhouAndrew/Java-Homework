package workbook.lab22;
/**
 Создать класс и объекты описывающие промежуток времени. Сам промежуток в классе должен задаваться тремя св-вами:
 секундами, минутами и часами. Сделать методы для получения полного количества секунд в объекте, сравнения двух
 объектов (метод должен работать аналогично compareTo в строках). Создать 2 конструктора, получающий общее кол-во
 секунд, и часы, минуты и секунды по отдельности. Сделать метод для вывода данных. Прочее на ваше усмотрение.

 */

public class TimeInterval {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconds) {
        this.seconds = seconds;
    }

    public TimeInterval(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int fullAmountSeconds() {
        int fullSeconds = getHours() * 3600 + getMinutes() * 60 + getSeconds();
        return fullSeconds;
    }

    public int comparisonOfIntervals(TimeInterval timeInterval) {
        return fullAmountSeconds() - timeInterval.fullAmountSeconds();
    }

    public void messageAboutTheEqualityOfObjects(int compOfIntervals) {
        if (compOfIntervals == 0) {
            System.out.println("объекты равны");
            return;
        } else {
            if (compOfIntervals < 0) {
                System.out.println("первый объект меньше второго");
                return;
            } else {
                System.out.println("первый объект больше второго");
            }
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "TimeInterval{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}
