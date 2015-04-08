package added.lab9;

import java.util.Calendar;
import java.util.Random;

/**
 * Created by vasilevich on 24.02.2015.
 */
public class PersonnelDepartment {
    private Employee[] personalDB;

    // Генерация случайным образом работника (общих полей для всех работников)
    private Employee generateEmployee(Employee employee) {

        Random random = new Random();

        employee.setFirstName(FirstNameEnum.values()[random.nextInt(FirstNameEnum.values().length)].toString());
        employee.setLastName(LastNameEnum.values()[random.nextInt(LastNameEnum.values().length)].toString());
        Calendar calendar = Calendar.getInstance();
        calendar.set(1970 + random.nextInt(20), random.nextInt(12) + 1, random.nextInt(31));
        employee.setBirthDate(calendar.getTime());
        calendar.set(2000 + random.nextInt(10), random.nextInt(12) + 1, random.nextInt(31));
        employee.setRecruitDate(calendar.getTime());
        return employee;
    }


    public PersonnelDepartment() {
    }

    // Установка штата компании
    public void setStaffSize(int directorCount, int salesManagerCount, int teamLeadCount, int developerCount) {
        int staffSize = directorCount + salesManagerCount + teamLeadCount + developerCount;
        this.personalDB = new Employee[staffSize];
        int allDevelopersCount = teamLeadCount + developerCount; //сколько всего людей может заниматься разработкой

        personalDB = new Employee[staffSize];
        //создание учетной записи директора
        for (int i = 0; i < directorCount; i++) {
            assignDirector();
        }

        //создание учетной записи меджеров по продажам
        for (int i = 0; i < salesManagerCount; i++) {
            assignSalesManager();
        }

        Random random = new Random();

        // список всех тим лидов в компании. Будет использовано для создания команд разработки
        int[] teamLeadArr = new int[teamLeadCount];

        //создание учетных записей тим лидов
        for (int i = 0; i < teamLeadCount; i++) {
            teamLeadArr[i] = assignTeamLead(random.nextInt(allDevelopersCount - 1) + 1);
        }

        //создание учетных записей разработчиков
        for (int i = 0; i < developerCount; i++) {
            assignDeveloper();
        }

        // создание команд разработки
        for (int teamLeadInd : teamLeadArr) {
            if ((teamLeadInd >= 0) && (teamLeadInd < personalDB.length)) {
                if (personalDB[teamLeadInd].getClass().equals(TeamLead.class)) { //проверка учетной записи, является ли она тим лидом
                    TeamLead teamLead = (TeamLead) personalDB[teamLeadInd]; // получение доступа к объекту тим лида
                    int[] teamArr = teamLead.getTeam(); //создание списка с участниками команды
                    teamArr[0] = teamLeadInd; // тим лид всегда должен быть в команде
                    teamArr = createDevelopTeam(teamArr); // создание оставшейся команды
                    teamLead.setTeam(teamArr); // сохранение сгенеиррованного списка тим лиду
                }
            }
        }
    }

    //создание учетной записи директора
    private int assignDirector() {

        if (findDirector() == -1) {
            Employee employee = new Director();
            employee = generateEmployee(employee);
            employee.setJobType(JobType.DIRECTOR);
            return tryAddEmployeeToList(employee);
        } else {
            return -1;
        }

    }

    // проверка на наличие учетной записи директора. Он должен быть тоьлко 1
    private int findDirector() {
        int i = 0;
        for (Employee employee : personalDB) {
            if (employee != null) {
                if (employee.getClass().equals(Director.class)) {
                    System.out.println("employee Dir = " + employee.toString());
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    //создание учетных записей тим лидов
    private int assignTeamLead(int teamSize) {
        Random random = new Random();
        Employee employee = new TeamLead(TechDevelopmentSkills.values()[random.nextInt(TechDevelopmentSkills.values().length)], teamSize);
        employee = generateEmployee(employee);
        employee.setJobType(JobType.TEAM_LEAD);
        return tryAddEmployeeToList(employee);
    }

    //создание учетных записей разработчиков
    private int assignDeveloper() {
        Random random = new Random();
        Employee employee = new Developer(TechDevelopmentSkills.values()[random.nextInt(TechDevelopmentSkills.values().length)]);
        employee = generateEmployee(employee);
        employee.setJobType(JobType.DEVELOPER);
        return tryAddEmployeeToList(employee);
    }

    //создание учетной записи меджеров по продажам
    private int assignSalesManager() {
        Employee employee = new SalesManager();
        employee = generateEmployee(employee);
        employee.setJobType(JobType.SALES_MANAGER);
        return tryAddEmployeeToList(employee);

    }

    // попытка добавления созданной учетной записи работника в список работников фирмы
    private int tryAddEmployeeToList(Employee employee) {
        for (int i = 0; i < personalDB.length; i++) {
            if (personalDB[i] == null) {
                personalDB[i] = employee;
                return i;
            }
        }
        return -1;
    }

    // создание группы разработчиков (все должны быть уникальны и быть либо разработчиком либо тим лидом)
    private int[] createDevelopTeam(int[] teamArr) {
        for (int teamPerson = 1; teamPerson < teamArr.length; teamPerson++) { //первый в списке всегда тим лид группы
            int teamCandidate = findRandDeveloper(); // ищем рандомного разработчика
            while (!checkTeamCandidate(teamArr, teamCandidate)) { // проверяем что бы его не было уже в списка данной группы и производим поиск, пока не найдем нового
                teamCandidate = findRandDeveloper();
            }
            teamArr[teamPerson] = teamCandidate; // заносим его в список группы если его еще в ней нету
        }
        return teamArr;
    }

    // проверка добаляемой записи на уникальность в списке (таких быть не должно)
    private boolean checkTeamCandidate(int[] team, int teamCandidate) {
        for (int i : team) {
            if (i == teamCandidate) {
                return false;
            }
        }
        return true;
    }

    // поиск любого возможного разработчика на фирме
    private int findRandDeveloper() {
        int teamCount = personalDB.length;
        Random random = new Random();
        while (true) {// будем искать пока не найдем
            int checkForDeveloper = random.nextInt(teamCount);
            if ((personalDB[checkForDeveloper].getClass().equals(Developer.class)) ||
                    (personalDB[checkForDeveloper].getClass().equals(TeamLead.class))) { //проверка на принадлежность к разработчикам

                return checkForDeveloper; // выходим если разработчик
            }

        }
    }


    @Override
    public String toString() {
        StringBuilder departmentStr = new StringBuilder();
        int i = 1;
        for (Employee employee : personalDB) {
            departmentStr.append(i++ + ". ").append(employee).append('\n');

        }

        return departmentStr.toString();
    }
}
