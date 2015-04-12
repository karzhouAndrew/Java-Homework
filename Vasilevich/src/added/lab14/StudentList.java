package added.lab14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sam on 11.03.2015.
 */
public class StudentList {
    private List<StudentMark> studentMarkList = new ArrayList<StudentMark>();

    public void readFromFile(String fileName) throws IOException {
        BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
        String studentLine = inputStream.readLine();
        studentMarkList.clear();
        while (studentLine != null) {
            StudentMark studentMark = new StudentMark();
            studentMark.setStudentStrLine(studentLine);
            studentMarkList.add(studentMark);
            studentLine = inputStream.readLine();

        }
    }

    public void checkStudents() {
        for (StudentMark studentMark : studentMarkList) {
            if (studentMark.averageMark() > 7) {
                studentMark.setLastName(studentMark.getLastName().toUpperCase());
            }
        }
    }

    public boolean addStudentToList(String lastName, int[] marks) {
        return studentMarkList.add(new StudentMark(lastName, marks));
    }

    public boolean saveStudentsToFile(String fileName) throws IOException {
        File file = new File(fileName);
        file.createNewFile();


        BufferedOutputStream data = new BufferedOutputStream(new FileOutputStream(file));

        for (StudentMark studentMark : studentMarkList) {
            String line = studentMark.getStudentStrLine();
            for (int i = 0; i < line.length(); i++) {
                data.write((int) line.charAt(i));
            }
            data.write('\n');
        }
        data.close();
        return true;
    }
}
