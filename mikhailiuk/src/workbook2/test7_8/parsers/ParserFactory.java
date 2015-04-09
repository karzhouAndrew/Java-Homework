package workbook2.test7_8.parsers;

import workbook2.test7_8.parsers.impl.DOMParser;
import workbook2.test7_8.parsers.impl.StAXParser;

/**
 * Created by Natashka on 20.03.2015.
 */
public class ParserFactory {
    public Parser createParser(String parserType) {
        if (parserType.equals("DOM")) {
            return new DOMParser();
        }
        return new StAXParser();
    }
}
