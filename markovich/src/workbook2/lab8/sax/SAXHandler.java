package workbook2.lab8.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SAXHandler extends DefaultHandler {

    private List<Point> pointList = null;
    private Point point = null;

    public List<Point> getPointList() {
        return pointList;
    }

    boolean bCoordinateX = false;
    boolean bCoordinateY = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equalsIgnoreCase("point")) {
            String unit = attributes.getValue("unit");
            point = new Point();
            point.setUnit(unit);
            if (pointList == null) {
                pointList = new ArrayList<Point>();
            }
        } else if (qName.equalsIgnoreCase("x")) {
            bCoordinateX = true;
        } else if (qName.equalsIgnoreCase("y")) {
            bCoordinateY = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("point")) {
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


