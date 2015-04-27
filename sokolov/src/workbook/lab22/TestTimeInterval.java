package workbook.lab22;

public class TestTimeInterval {
    public static void main(String[] args) {
        TimeInterval tI1 = new TimeInterval(45);
        TimeInterval tI2 = new TimeInterval(50);
        TimeInterval tI3 = new TimeInterval(0,0,1);
        TimeInterval tI4 = new TimeInterval(0,60,0);

        tI1.messageAboutTheEqualityOfObjects(tI1.comparisonOfIntervals(tI2));
        System.out.println(tI1);
        System.out.println(tI2);

        tI3.messageAboutTheEqualityOfObjects(tI3.comparisonOfIntervals(tI4));
        System.out.println(tI3);
        System.out.println(tI4);
    }
}
