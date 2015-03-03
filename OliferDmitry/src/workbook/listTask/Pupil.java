package workbook.listTask;

public class Pupil {
    private Names name;
    private int mark;

    public Pupil(Names name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public Names getName() {
        return name;
    }

    public void setName(Names name) {
        this.name = name;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return name + " - " + mark;
    }
}
