package workbook.classesAndInterfaces.task03;
// Sozdat' klass i objekty, opisyvauschie promejutok vremeni
public class Main {
    public static void main(String[] args) {
        TimeInterval interval1 = new TimeInterval(3000);
        TimeInterval interval2 = new TimeInterval(1, 100, 100);

        System.out.println("Interval1: " + interval1.getSec() + " sec");
        System.out.println("Interval2: " + interval2.getSec() + " sec");
        System.out.println("Interval2 in compare with Interval1: " + interval2.compareIntervals(interval1) + " sec");
    }
}
/*
Time interval: 0 hrs, 0 min, 3000 sec
Time interval: 1 hrs, 100 min, 100 sec
Interval1: 3000 sec
Interval2: 9700 sec
Interval2 in compare with Interval1: 6700 sec
*/
