package classes.test_file_5;

/**
 * Created by Natashka on 11.03.2015.
 */
public class StudentTest {
    public static void main(String[] args) {
        StudentsListReader reader = new StudentsListReader();
        String str = reader.textToString();
        System.out.println(str);
        ChangeSurname changeSurname = new ChangeSurname();
        String changed=changeSurname.changer(str);
        System.out.println(changed);
        StudentsListWriter studentsListWriter =new StudentsListWriter();
        studentsListWriter.writer(changed);
    }
}
