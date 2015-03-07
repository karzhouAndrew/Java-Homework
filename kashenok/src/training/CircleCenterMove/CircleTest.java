package training.CircleCenterMove;

public class CircleTest {
    public static void main(String[] args) {
        System.out.println("Введите параметры окрцжности (координату Х, координату У и значение Радиуса");
        Circle circle = new Circle();
        System.out.println("circle = " + circle.toString());
        // circle.moveCircle(circle.getX(), circle.getY());
        // System.out.println("circle = " + circle.toString());
        Circle bigCircle = new Circle();
        System.out.println("bigCircle = " + bigCircle);

        int xDifference = -circle.getX() + bigCircle.getX();
        int yDifference = -circle.getY() + bigCircle.getY();

        Touching isTouch = new Touching();

        System.out.println("isTouch = " + isTouch.isTouching(xDifference,yDifference,bigCircle.getRad(),circle.getRad()));

    }

}

