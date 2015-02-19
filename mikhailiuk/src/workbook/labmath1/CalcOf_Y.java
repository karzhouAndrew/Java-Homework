package workbook.labmath1;


/**
 * Created by Natashka on 15.02.2015.
 */
public class CalcOf_Y {
    public static void main(String[] args) {
        double y, y1;
        MathCalc mathCalc = new MathCalc();
        mathCalc.setS(5);
        mathCalc.setT(7);
        mathCalc.setX(13);
        y = mathCalc.yCalc();
        y1 = mathCalc.yCalc1();
        System.out.println(y);
        System.out.println(y1);
    }
}
