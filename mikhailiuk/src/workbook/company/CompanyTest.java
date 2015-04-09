package workbook.company;

import java.util.Random;

/**
 * Created by Natashka on 25.02.2015.
 */
public class CompanyTest {
    public static void main(String[] args) {
        Random random = new Random();
        Manager manager = new Manager();
        TeamLead teamLead = new TeamLead();
        TeamLead teamLead1 = new TeamLead();
        manager.recruit(manager);
        System.out.println("Директор " + manager.getName() + " " + manager.getSurname() + " " + manager.getBirthDate() + " " + manager.getEmploymentDate());
        manager.recruit(teamLead);
        System.out.println("Руководитель команды1 " + teamLead.getName() + " " + teamLead.getSurname() + " " + teamLead.getBirthDate() + " " + teamLead.getEmploymentDate());
        manager.recruit(teamLead1);
        System.out.println("Руководитель команды2 " + teamLead1.getName() + " " + teamLead1.getSurname() + " " + teamLead1.getBirthDate() + " " + teamLead1.getEmploymentDate());
        Developer[] developers = new Developer[6];
        for (int i = 0; i < developers.length; i++) {
            Developer developer = new Developer("Java");
            developers[i] = developer;
            manager.recruit(developers[i]);
        }
        int[] indexArr = new int[3];
        for (int i = 0; i < indexArr.length; i++) {
            indexArr[i] = random.nextInt(6);
            teamLead.recruit(developers[indexArr[i]]);
        }
        for (int i=0;i<developers.length;i++) {
            for (int j : indexArr) {
                if(i!=j){
                 teamLead1.recruit(developers[i]);
                }
            }
        }
        Employee[] tempArr = teamLead.getTeam();
        System.out.println("Команда1");
        for (int i = 0; i < teamLead.team.length; i++) {
            System.out.println("Разработчик #" + i + " " + tempArr[i].getName() + " " + tempArr[i].getSurname() + " " + tempArr[i].getBirthDate() + " " + tempArr[i].getEmploymentDate());
        }
        Employee[] tempArr1 = teamLead1.getTeam();
        System.out.println("Команда2");
        for (int i = 0; i < teamLead1.team.length; i++) {
            System.out.println("Разработчик #" + i + " " + tempArr1[i].getName() + " " + tempArr1[i].getSurname() + " " + tempArr1[i].getBirthDate() + " " + tempArr1[i].getEmploymentDate());
        }
        Seller[] sellers = new Seller[3];
        for (int i = 0; i < sellers.length; i++) {
            Seller seller = new Seller(80);
            sellers[i] = seller;
            manager.recruit(sellers[i]);
            System.out.println("Продавец #" + i + " " + sellers[i].getName() + " " + sellers[i].getSurname() + " " + sellers[i].getBirthDate() + " " + sellers[i].getEmploymentDate() + " " + sellers[i].getLevel());
        }
    }
}
