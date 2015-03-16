package added.lab9;


/**
 * Created by vasilevich on 24.02.2015.
 * База сотрудников
 * Необходимо разработать приложение, которое содержит базу сотрудников
 * компании, занимающейся разработкой ПО. В компании есть: менеджеры по
 * продажам, разработчики, руководители команд (занимается разработкой и
 * управлением команды), директор (только один).
 * Каждый запись о сотруднике должна содержать
 *  имя
 *  фамилию
 *  дату рождения
 *  дату принятия на работу
 * Программист содержит информацию о технологии, которой он использует.
 * Руководитель команды должен иметь список разработчиков в его команде.
 */
public class TestCompany {
    public static void main(String[] args) {

        int directorCount = 1;
        int teamLeadsCount = 2;
        int developersCount = 10;
        int salesManagersCount = 13;

        PersonnelDepartment department = new PersonnelDepartment();
        department.setStaffSize(directorCount, salesManagersCount, teamLeadsCount, developersCount);
        System.out.println(department);
    }


}
