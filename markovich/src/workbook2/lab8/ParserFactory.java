package workbook2.lab8;

public class ParserFactory {

    public static Parser getParser(ParsersTypeEnum parsersTypeEnum) {
        return parsersTypeEnum.getParser();
    }
}
