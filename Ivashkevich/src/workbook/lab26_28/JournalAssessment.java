package workbook.lab26_28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Leonid on 05.03.2015.
 */
public class JournalAssessment {

    public List<String> arrayJournalAssessment() {
        List<String> journalAssessment = new ArrayList<String>();
        for (int i = 0; i < 30; i++) {
            journalAssessment.add(Names.getNameRandom() + ": " + (int) (Math.random() * 100 + 1));
        }
        System.out.println("\nJournal Assessments");
        for (String str : journalAssessment) {
            System.out.println(str);
        }
        Iterator<String> iterator = journalAssessment.iterator();
        Integer maxAssessment = 0;
        while (iterator.hasNext()) {
            String currentString = iterator.next();
            Integer currentAssessment = AssessmentOfString.getAssessmentOfString(currentString);
            if (currentAssessment >= maxAssessment) {
                maxAssessment = currentAssessment;
            }
        }
        System.out.println("\nBest Assessments");
        for (String str : journalAssessment) {
            Integer currentAssessment = AssessmentOfString.getAssessmentOfString(str);
            if (currentAssessment.equals(maxAssessment)) {
                System.out.println(str);
            }
        }
        System.out.println("\nGood Assessments");
        for (String str : journalAssessment) {
            Integer currentAssessment = AssessmentOfString.getAssessmentOfString(str);
            if (currentAssessment >= 75) {
                System.out.println(str);
            }
        }
        return journalAssessment;
    }
}
