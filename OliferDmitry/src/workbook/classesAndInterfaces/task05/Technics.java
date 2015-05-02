package workbook.classesAndInterfaces.task05;

abstract public class Technics {
    private boolean turnOnTrigger;

    abstract public void setBrandName(String brandName);
    abstract public String getBrandName();
    abstract public void setModel(String model);
    abstract public String getModel();

    public void turnOn() {
        turnOnTrigger = true;
        System.out.println(this.getBrandName() + "(" + this.getModel() + ") is turned ON");
    }

    public void turnOff() {
        turnOnTrigger = false;
        System.out.println(this.getBrandName() + "(" + this.getModel() + ") is turned OFF");
    }
}
