package training.CircleCenterMove;

import java.util.Scanner;

public class Circle {
     Scanner scan = new Scanner(System.in);
    int x;
    int y;
    int rad;


   public Circle() {
        this.x = scan.nextInt();
        this.y= scan.nextInt();
        this.rad = scan.nextInt();
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getRad() {
        return rad;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", rad=" + rad +
                '}';
    }

    public void moveCircle(int x, int y){
        this.x= (int) (this.x + (-99 + Math.random()*200));
        this.y = (int) (this.y + (-99 + Math.random()*200));
    }
    boolean touching;
    public boolean isTouching(int xdif, int ydif, int r1, int r2 ){
        if (Math.sqrt(Math.pow(xdif,2)+Math.pow(ydif,2)) == r2+r1 && Math.sqrt(Math.pow(xdif,2)+Math.pow(ydif,2)) == r2+r1){
            touching = true;
        }
        else {touching =false;}
        return touching;
    }





}
