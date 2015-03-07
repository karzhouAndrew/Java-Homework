package training.CircleCenterMove;

/**
 * Created by Рома on 24.02.2015.
 */
public class Touching {
    int xdif;
    int ydif;
    int r1;
    int r2;

    public Touching() {
    }

    public Touching (int xdif, int ydif, int r1, int r2) {
        this.xdif = xdif;
        this.ydif = ydif;
        this.r1 = r1;
        this.r2 = r2;
    }

    boolean touching;



    public boolean isTouching(int xdif, int ydif, int r1, int r2){
        if (Math.sqrt(Math.pow(xdif,2)+Math.pow(ydif,2)) == r2+r1 && Math.sqrt(Math.pow(xdif,2)+Math.pow(ydif,2)) == r2+r1){
            touching = true;
        }
        else {touching =false;}
        return touching;
    }
}
