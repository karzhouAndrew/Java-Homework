package homework.task_1.task_16;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Алексей Андреенко on 17.02.2015..
 */
public class AllPunct {
    int numofPunct = 0;

    public int matchAllPunct(String sentence) throws IOException {
        Pattern allPunctPattern = Pattern.compile("[!.,;:?()]+");
        Matcher allPunctMatcher = allPunctPattern.matcher(sentence);
        while (allPunctMatcher.find()) {
            numofPunct += 1;
        }
        return numofPunct;
    }
}

