package homework.work6.Task6;

/**
 * Created by Tonya on 05.03.2015.
 */
public class TypeCard extends Card {
    private String type;
    public TypeCard(String type,String system){
        super(system);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
