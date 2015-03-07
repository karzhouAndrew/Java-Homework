package homework.lesson10.workersBase;

import java.util.Random;

/**
 * Created by Рома on 25.02.2015.
 */
public class WorkersTest {
    public static void main(String[] args) {



/*
        Workers firstManager = new Manager("Бытовуха","","");
        firstManager.setName(randomName.nameGenerator());

        System.out.println("workers = " + firstManager.toString());
*/

        Manager[] worker = new Manager[2];
        NamesBase randomField = new NamesBase();
        for (int i = 0; i < worker.length; i++) {
            worker[i] = new Manager("Бытовуха", "", "");
            worker[i].setName(randomField.nameGenerator());
            worker[i].setSurname(randomField.surNameGenerator());
            worker[i].setSales("Падаван");
            System.out.println("manager[" + i + "] = " + worker[i].toString());
        }
        System.out.println();

        Developer[] developer = new Developer[3];
        for (int i = 0; i < developer.length; i++) {
            developer[i] = new Developer("", "", "");
            developer[i].setName(randomField.nameGenerator());
            developer[i].setSurname(randomField.surNameGenerator());
            developer[i].setUsingTechnology(randomField.usingTechnologyGEnerator());
            System.out.println("developer[" + i + "] = " + developer[i].toString());
        }
        System.out.println();
        Director director = new Director();
        director.setName("Алешка");
        director.setSurname("Попович");
        System.out.println("director = " + director.toString());


        System.out.println();

        developer[2] = director.makeDeveloperWork(developer[2]);
        System.out.println("developer[2] = " + developer[2].toString());
    }


}
