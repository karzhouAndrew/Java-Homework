package workbook.lab2_3;

/*
 * Имеется промежуток времени в секундах. Следует вывести его на страницу в виде часов минут и секунд и т.д.
 * Определите, является ли последняя цифра числа семеркой.
 */
public class Lab2_3 {
    public static void main(String[] args) {
        long seconds = 2133720168547758L;
        long secondsAtResidue = seconds % 60;
        long minutes = (seconds - secondsAtResidue) / 60;
        long minutesAtResidue = minutes % 60;
        long hours = (minutes - minutesAtResidue) / 60;
        long hoursAtResidue = hours % 24;
        long days = (hours - hoursAtResidue) / 24;
        long daysAtResidue = days % 7;
        long weeks = (days - daysAtResidue) / 7;
        long weeksAtResidue = weeks % 52;
        long years = (weeks - weeksAtResidue) / 52;
        long yearsAtResidue = years % 100;
        long century = (years - yearsAtResidue) / 100;
        long centuryAtResidue = century % 1000;
        long millennium = (century - centuryAtResidue) / 1000;


        System.out.println(millennium + " тысячелетий " + centuryAtResidue + " веков " + yearsAtResidue + " лет " + weeksAtResidue + " недель " + daysAtResidue + " дней " + hoursAtResidue + " часов " + minutesAtResidue + " минут " + secondsAtResidue + " секунд");
        if (centuryAtResidue % 2 == 0) {
            System.out.println("Колличество веков " + centuryAtResidue + " четное");
        } else {
            System.out.println("Колличество веков " + centuryAtResidue + " нечетное");
        }

        long q = centuryAtResidue % 10;
        if (q != 7) {
            System.out.println("Последняя цифра колличества веков не семь и равна: " + q);
        } else {
            System.out.println("Последняя цифра колличества веков семь");
        }
    }
}
