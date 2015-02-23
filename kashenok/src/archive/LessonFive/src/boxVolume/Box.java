package boxVolume;

public class Box {
    double width;
    double heigth;
    double depth;

    Box(double widthbox, double heigthbox, double depthbox){
        width = widthbox;
        heigth = heigthbox;
        depth = depthbox;

    }

    double volume (){
        double vol;
        vol = width*heigth*depth;
        return vol;
    }
}
