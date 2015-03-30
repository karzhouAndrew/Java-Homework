package workbook.classwork.emloyeeDatabase;

public class Main {

    public static void main(String[] args) {
        Director director1 = new Director();
        Director director2 = new Director();
        Developer developer1 = director1.hireDeveloper();
        Developer developer2 = director1.hireDeveloper();
        Manager manager1 = director1.hireManager();
        Manager manager2 = director1.hireManager();
        TeamLeader teamLeader1 = director1.hireTeamLeader();

        Project project1 = developer1.startNewProject("-= E-shop =-");
        director1.priceTheProject(project1);
        System.out.println(developer1);

        Project project2 = developer2.startNewProject("-= Android Application =-");
        teamLeader1.completeTheProject(project2);
        director1.priceTheProject(project2);
        manager1.sellProject(project2);
    }
}
/* Console output:

Director VLADIMIR IVANOV, birth date 1981, hired Wed Jun 04 19:26:40 BRT 2014
   <<<   You can't hire another one director!   >>>
Developer YURI FEDOROV, tech=CPP, birth date 1991, hired Sat Jan 12 19:26:40 BRT 2013, currentProject: 'none'
Developer SEMEN MALKIN, tech=C, birth date 1990, hired Sat Aug 16 19:26:40 BRT 2008, currentProject: 'none'
Manager IVAN KAMENSKY, birth date 1976, hired Fri Dec 19 19:26:40 BRT 2014
Manager VLADIMIR IVANOV, birth date 1984, hired Tue Jan 27 19:26:40 BRT 2009
Team leader YURI IZMAILOV, birth date 1981, hired Thu Aug 07 19:26:40 BRT 2008
YURI FEDOROV started project -= E-shop =-
<<<   Shit!!! -=SIMPLE_DATABASE=- is not ready yet! Wtf? YURI FEDOROV, you fired, asshole!!!   >>>
YURI FEDOROV is fired
Developer YURI FEDOROV, tech=CPP, birth date 1991, hired Sat Jan 12 19:26:40 BRT 2013, currentProject: '-= E-shop =-'
SEMEN MALKIN started project -= Android Application =-
   <<<   -=PRESENTATION_FORM=- complited   >>>
   <<<   -=PRESENTATION_FORM=- costs $298   >>>
   <<<   IVAN KAMENSKY sold product -=PRESENTATION_FORM=- (developed by SEMEN MALKIN)   >>>
*/
