package workbook2.garden.entity;

/**
 * Created by Natashka on 24.03.2015.
 */
public class Bush extends Plant {
    private String hedgeType;
    private String blossomType;

    public Bush(String name, int age, double height, String hedgeType, String blossomType) {
        super(name, age, height);
        this.hedgeType = hedgeType;
        this.blossomType = blossomType;
    }

    public Bush(String hedgeType, String blossomType) {
        this.hedgeType = hedgeType;
        this.blossomType = blossomType;
    }

    public Bush() {
    }

    public String getHedgeType() {
        return hedgeType;
    }

    public void setHedgeType(String hedgeType) {
        this.hedgeType = hedgeType;
    }

    public String getBlossomType() {
        return blossomType;
    }

    public void setBlossomType(String blossomType) {
        this.blossomType = blossomType;
    }

    @Override
    public String toString() {
        return "Bush{" +
                "hedgeType='" + hedgeType + '\'' +
                ", blossomType='" + blossomType + '\'' + super.toString();
    }
}
