package workbook.lab28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListOperations {

    public static List<Student> fillingList(int quantity) {
        Random random = new Random();
        List<Student> studentList = new ArrayList<Student>();
        for (int i = 0; i < quantity; i++) {
            studentList.add(new Student());
        }
        return studentList;
    }

}

