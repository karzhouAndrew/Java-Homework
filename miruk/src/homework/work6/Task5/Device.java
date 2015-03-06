package homework.work6.Task5;

/**
 * Created by Tonya on 05.03.2015.
 */
public class Device {
    private boolean enable;
    public Device(){
        enable = false;
    }

    public Device(boolean enable){
        this.enable = enable;
    }

    public  void setEnable(boolean enable){
        this.enable = enable;
    }

    public boolean isEnable() {
        return enable;
    }
}
