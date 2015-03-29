package workbook2.garden.Parser;

import workbook2.garden.Parser.impl.DOMParser;
import workbook2.garden.Parser.impl.SAXParser;
import workbook2.garden.Parser.impl.StAXParser;

/**
 * Created by Natashka on 24.03.2015.
 */
public class ParserFactory {
    public Parser createParser(String parserType) {
        if (parserType.equals("DOM")) {
            return new DOMParser();
        } else if (parserType.equals("StAX")) {
            return new StAXParser();
        }
        return new SAXParser();
    }
}
