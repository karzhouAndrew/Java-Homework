package workbook2.garden.Parser;

import workbook2.garden.entity.Plant;

import java.io.File;
import java.util.List;

/**
 * Created by Natashka on 24.03.2015.
 */
public interface Parser {
     List<Plant> parse(File file);
}
