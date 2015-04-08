package workbook2.lab8;

import workbook2.lab8.dom.ParserDOM;
import workbook2.lab8.sax.ParserSAX;
import workbook2.lab8.stax.ParserSTAX;

public enum ParsersTypeEnum {
    DOM {
        public Parser getParser() {
            return new ParserDOM();
        }
    },
    SAX {
        public Parser getParser() {
            return new ParserSAX();
        }
    },
    STAX {
        public Parser getParser() {
            return new ParserSTAX();
        }
    };

    public abstract Parser getParser();
}
