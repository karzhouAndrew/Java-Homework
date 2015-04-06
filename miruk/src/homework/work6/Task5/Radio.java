package homework.work6.Task5;

/**
 * Created by Tonya on 05.03.2015.
 */
public class Radio extends Microwalve {
    private int program;
    private int volume;

    public Radio(){
        super();
        program = 0;
        volume = 0;
    }

    public Radio(int volume, int program,int power, boolean enable){
        super(power,enable);
        this.volume = volume;
        this.program = program;
    }

    public int getProgram() {
        return program;
    }

    public void setProgram(int program) {
        this.program = program;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
