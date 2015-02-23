package homework.lesson9.homeAppliances;

public class LargeTechnics {
    protected String mass;
    protected String colour;
    boolean isOn = false;

    public String getMass() {
        return mass;
    }
    public void setMass(String mass) {
        this.mass = mass;
        System.out.println("mass = " + mass);
    }
    public String getColour() {
        System.out.println("colour = " + colour);
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
        System.out.println("colour = " + colour);
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}
