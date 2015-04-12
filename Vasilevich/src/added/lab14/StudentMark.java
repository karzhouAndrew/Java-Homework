package added.lab14;

import java.util.List;

/**
 * Created by Sam on 11.03.2015.
 */
public class StudentMark {
    private String lastName;
    private int[] marks;

    public StudentMark() {
    }

    public StudentMark(String lastName, int[] marks) {
        this.lastName = lastName;
        this.marks = marks;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double averageMark() {
        int sum = 0;
        double average = 0;
        for (int mark : marks) {
            sum += mark;
        }
        if (marks.length > 0) {
            average = (double) sum / marks.length;
        }
        return average;
    }

    public String getStudentStrLine() {
        StringBuilder student = new StringBuilder(lastName);
        for (int mark : marks) {
            student.append(' ').append(mark);
        }
        return (student.toString());
    }

    public void setStudentStrLine(String studentLine) {
        String[] lines = studentLine.split(" ");
        lastName = lines[0];
        marks = new int[lines.length - 1];
        for (int i = 1; i < lines.length; i++) {
            marks[i - 1] = Integer.parseInt(lines[i]);
        }
//         marks = studentLine.split(" ");// startsWith(studentLine);
    }
}
