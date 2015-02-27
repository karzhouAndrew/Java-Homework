package homework.lesson10.workersBase;

import java.util.Date;

/**
 * Created by Рома on 25.02.2015.
 */
public class Developer extends Workers {
    String usingTechnology;

    public Developer(String usingTechnology) {
        this.usingTechnology = usingTechnology;
    }

    public Developer(String name,String usingTechnology) {
        super(name);
        this.usingTechnology = usingTechnology;
    }


}
