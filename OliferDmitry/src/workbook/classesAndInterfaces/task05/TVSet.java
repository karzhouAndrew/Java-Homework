package workbook.classesAndInterfaces.task05;

public class TVSet extends StationeryDevice{
    private String brandName;
    private String model;

    public TVSet(String brandName) {
        this.brandName = brandName;
        this.model = "...";
        super.turnOff();
    }

    public TVSet(String brandName, String model) {
        this.brandName = brandName;
        this.model = model;
        super.turnOff();
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrandName() {
        return brandName;
    }

    public String getModel() {
        return model;
    }
}
