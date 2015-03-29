package workbook2.test7_8.parsers;

import workbook2.test7_8.entity.Point;

import java.io.File;
import java.util.List;

/**
 * Created by Natashka on 20.03.2015.
 */
public interface Parser {
    List<Point> parse(File file);
}
