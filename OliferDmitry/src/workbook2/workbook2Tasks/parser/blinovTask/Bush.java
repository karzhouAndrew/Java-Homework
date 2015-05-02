package workbook2.workbook2Tasks.parser.blinovTask;

public class Bush extends Plant {

    private boolean berries;
    private String inflorescence;
    public static final double growMetresPerYear = 0.2;

    public Bush(String name, double age, double height, boolean berries, String inflorescence) {
        super(name, age, height);
        this.berries = berries;
        this.inflorescence = inflorescence;
    }

    public boolean isBerries() {
        return berries;
    }

    public void setBerries(boolean berries) {
        this.berries = berries;
    }

    public String getInflorescence() {
        return inflorescence;
    }

    public void setInflorescence(String inflorescence) {
        this.inflorescence = inflorescence;
    }

    public double getGrowMetresPerYear() {
        return growMetresPerYear;
    }

    @Override
    public String toString() {
        return "\nBush (" +
                "name=" + super.getName().toUpperCase() +
                ", age=" + super.getAge() +
                ", height=" + super.getHeight() +
                ", berries=" + berries +
                ", inflorescence='" + inflorescence + '\'' +
                ")";
    }

    public boolean getBerries() {
        return berries;
    }
}
