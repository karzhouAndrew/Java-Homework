package workbook2.lab8.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import workbook2.lab8.Point;

import java.util.ArrayList;
import java.util.List;

import static workbook2.lab8.PointTags.*;

public class SAXHandler extends DefaultHandler {

    private List<Point> pointList;
    private Point point;

    public List<Point> getPointList() {
        return pointList;
    }

    private boolean bCoordinateX;
    private boolean bCoordinateY;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase(POINT.toString().toLowerCase())) {
            String unit = attributes.getValue(UNIT.toString().toLowerCase());
            point = new Point();
            point.setUnit(unit);
            if (pointList == null) {
                pointList = new ArrayList<Point>();
            }
        } else if (qName.equalsIgnoreCase(X.toString().toLowerCase())) {
            bCoordinateX = true;
        } else if (qName.equalsIgnoreCase(Y.toString().toLowerCase())) {
            bCoordinateY = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase(POINT.toString().toLowerCase())) {
            pointList.add(point);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (bCoordinateX) {
            point.setCoordinateX(Integer.parseInt(new String(ch, start, length)));
            bCoordinateX = false;
        } else if (bCoordinateY) {
            point.setCoordinateY(Integer.parseInt(new String(ch, start, length)));
            bCoordinateY = false;
        }
    }
}


