package workbook.lab22;

/**
 * Created by Asus on 21.02.2015.
 */
public class Cube {
    int side;
    String color;

    Cube(int s, String color) {
        side = s;
        this.color = color;
    }

    int volumeCube() {
        return (int) Math.pow(side, 3);
    }

    int areaCube() {
        return 6 * (int) Math.pow(side, 2);
    }

    }
