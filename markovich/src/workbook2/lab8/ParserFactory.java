package workbook2.lab8;

import workbook2.lab8.dom.ParserDOM;
import workbook2.lab8.sax.ParserSAX;
import workbook2.lab8.stax.ParserSTAX;

public class ParserFactory {

    public static Parser getParser(ParsersType parserType) {
        switch (parserType) {
            case DOM:
                return new ParserDOM();
           case STAX:
                return new ParserSTAX();
            case SAX:
                return new ParserSAX();
            default:
                throw new IllegalArgumentException("Parser of this type does not exist");
        }
    }

}
