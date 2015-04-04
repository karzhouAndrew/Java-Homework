package workbook2.lab8;

import workbook2.lab8.dom.ParserDOM;
import workbook2.lab8.sax.ParserSAX;
import workbook2.lab8.stax.ParserSTAX;

public class ParserFactory {
    public static void getParser(ParsersType parserType, String xmlFilePath) {
        switch (parserType) {
            case DOM:
                ParserDOM.parseFile(xmlFilePath);
                break;
            case STAX:
                ParserSTAX.parseFile(xmlFilePath);
                break;
            case SAX:
                ParserSAX.parseFile(xmlFilePath);
                break;
        }
    }
}
