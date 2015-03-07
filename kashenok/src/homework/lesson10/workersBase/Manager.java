package homework.lesson10.workersBase;

import java.util.Date;

/**
 * Created by Рома on 25.02.2015.
 */
public class Manager  extends Workers{
    private  String sales;

    public Manager(String name, String surname, String sales) {
        super(name,surname);
        this.sales = sales;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "sales='" + sales + '\'' +
                ", randomName=" + getName()+", randomSurName=" + getSurname()+
                '}';
    }
}
