package homework.lesson10.workersBase;

import java.util.Date;

/**
 * Created by Рома on 25.02.2015.
 */
public class TeamLead extends Workers {
    int subordinates;

    public TeamLead(int subordinates) {
        this.subordinates = subordinates;
    }

    public TeamLead(String name, int subordinates) {
        super(name);
        this.subordinates = subordinates;
    }
}
