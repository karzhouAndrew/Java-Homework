package homework.lesson10.workersBase;

import java.util.Random;

/**
 * Created by Рома on 25.02.2015.
 */
public class WorkersTest {
    public static void main(String[] args) {


        NamesBase randomName = new NamesBase();
/*
        Workers firstManager = new Manager("Бытовуха","","");
        firstManager.setName(randomName.nameGenerator());

        System.out.println("workers = " + firstManager.toString());
*/
        Manager [] manager = new Manager[4];

        for (int i=0; i<manager.length; i++) {
            manager [i] = new Manager("Бытовуха","","");
            manager [i].setName(randomName.nameGenerator());
            manager [i].setSurname(randomName.surNameGenerator());
            manager[i].setSales("Падаван");
            System.out.println("manager["+i+"] = " + manager[i].toString());
        }


    }

}
